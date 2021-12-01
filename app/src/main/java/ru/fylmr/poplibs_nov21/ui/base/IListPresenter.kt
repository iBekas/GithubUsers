package ru.fylmr.poplibs_nov21.ui.base

import ru.fylmr.poplibs_nov21.ui.users.UserItemView

interface IListPresenter<V : IItemView> {

    var itemClickListener: (UserItemView) -> Unit

    fun getCount(): Int

    fun bindView(view: V)
}
