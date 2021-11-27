package ru.fylmr.poplibs_nov21.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import ru.fylmr.poplibs_nov21.databinding.FragmentUserDetailBinding
import ru.fylmr.poplibs_nov21.databinding.FragmentUsersBinding

class UserDetailFragment : MvpAppCompatFragment(), DetailView {

    private var _binding: FragmentUserDetailBinding? = null
    private val binding: FragmentUserDetailBinding
        get(): FragmentUserDetailBinding {
            return _binding!!
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUserDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun bindUserLogin(login: String) {
        binding.tvUserName.text = login
    }

}
