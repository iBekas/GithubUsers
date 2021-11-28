package ru.fylmr.poplibs_nov21.ui.users

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle


interface DetailView: MvpView {

    @AddToEndSingle
    fun bindUserLogin(login: String?)
}