package ru.fylmr.poplibs_nov21.ui.users

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.fylmr.poplibs_nov21.domain.GithubUsersRepository
import ru.fylmr.poplibs_nov21.model.GithubUserModel
import ru.fylmr.poplibs_nov21.ui.base.IListPresenter

class UsersPresenter(
    private val router: Router,
    private val usersRepository: GithubUsersRepository,
) : MvpPresenter<UsersView>() {

    val usersListPresenter = UsersListPresenter()

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        loadData()

        usersListPresenter.itemClickListener = {} // todo
    }

    private fun loadData() {
        val users = usersRepository.getUsers()
        usersListPresenter.users.addAll(users)

        viewState.updateList()
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }

    class UsersListPresenter : IListPresenter<UserItemView> {

        val users = mutableListOf<GithubUserModel>()

        override var itemClickListener = { }

        override fun getCount() = users.size

        override fun bindView(view: UserItemView) {
            val user = users[view.pos]
            view.setLogin(user.login)
        }
    }
}