package ru.fylmr.poplibs_nov21.ui.users.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter
import ru.fylmr.poplibs_nov21.App
import ru.fylmr.poplibs_nov21.R
import ru.fylmr.poplibs_nov21.databinding.FragmentUserDetailBinding
import ru.fylmr.poplibs_nov21.ui.base.BackButtonListener

class UserDetailFragment : MvpAppCompatFragment(), DetailView, BackButtonListener {

    companion object {
        const val KEY_GIT_USER = "KEY"
        fun newInstance(bundle: Bundle): UserDetailFragment {
            val fragment = UserDetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    private val presenter by moxyPresenter { DetailPresenter(App.instance.router, arguments?.getString(
        KEY_GIT_USER
    )) }

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

    override fun backPressed(): Boolean {
        presenter.backPressed()
        return true
    }

}
