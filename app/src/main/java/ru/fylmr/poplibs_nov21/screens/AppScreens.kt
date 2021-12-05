package ru.fylmr.poplibs_nov21.screens

import android.os.Bundle
import com.github.terrakok.cicerone.androidx.FragmentScreen
import ru.fylmr.poplibs_nov21.ui.users.detail.UserDetailFragment
import ru.fylmr.poplibs_nov21.ui.users.UsersFragment

object AppScreens {

    fun usersScreen() = FragmentScreen {
        UsersFragment()
    }

    fun detailScreen(login: String) = FragmentScreen {
        UserDetailFragment.newInstance(Bundle().apply {
            putString(UserDetailFragment.KEY_GIT_USER, login)
        })
    }
}
