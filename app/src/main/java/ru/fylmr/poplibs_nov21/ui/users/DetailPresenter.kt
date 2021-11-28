package ru.fylmr.poplibs_nov21.ui.users

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import ru.fylmr.poplibs_nov21.screens.AppScreens


class DetailPresenter(private val router: Router, private val login: String?): MvpPresenter<DetailView>() {

    fun setLogin(){
        viewState.bindUserLogin(login)
    }

//    fun backPressed(): Boolean {
//        router.backTo(AppScreens.usersScreen())
//        return false
//    }
}
