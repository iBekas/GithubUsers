package ru.fylmr.poplibs_nov21.ui.users

import moxy.MvpPresenter


class DetailPresenter(private val login: String?): MvpPresenter<DetailView>() {

    fun setLogin(){
        viewState.bindUserLogin(login)
    }
}
