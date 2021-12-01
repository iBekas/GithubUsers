package ru.fylmr.poplibs_nov21.ui.users

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.fylmr.poplibs_nov21.domain.GithubUsersRepository
import ru.fylmr.poplibs_nov21.model.GithubUserModel
import ru.fylmr.poplibs_nov21.screens.AppScreens

class UsersPresenter(
    private val router: Router,
    private val usersRepository: GithubUsersRepository,
) : MvpPresenter<UsersView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        loadData()
    }

    private fun loadData() {
        val users = usersRepository.getUsers()

        viewState.updateList(users)
    }

    fun onUserClicked(userModel: GithubUserModel) {
        router.navigateTo(AppScreens.detailScreen(userModel.login))
    }

    fun backPressed(): Boolean {
        router.exit()
        return true
    }
}
