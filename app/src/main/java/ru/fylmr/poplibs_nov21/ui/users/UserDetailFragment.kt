package ru.fylmr.poplibs_nov21.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.fylmr.poplibs_nov21.App
import ru.fylmr.poplibs_nov21.R
import ru.fylmr.poplibs_nov21.databinding.FragmentUserDetailBinding
import ru.fylmr.poplibs_nov21.databinding.FragmentUsersBinding
import ru.fylmr.poplibs_nov21.domain.GithubUsersRepository

class UserDetailFragment : MvpAppCompatFragment(), DetailView {

    companion object {
        const val KEY_GIT_USER = "KEY"
        fun newInstance(bundle: Bundle): UserDetailFragment {
            val fragment = UserDetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    private val presenter by moxyPresenter { DetailPresenter(arguments?.getString(KEY_GIT_USER)) }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.setLogin()
    }

    override fun bindUserLogin(login: String?) {
        binding.tvUserName.text = login ?: getString(R.string.unknown)
    }

}
