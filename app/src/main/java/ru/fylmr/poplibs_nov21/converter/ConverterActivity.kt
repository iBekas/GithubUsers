package ru.fylmr.poplibs_nov21.converter

import android.os.Bundle
import moxy.MvpAppCompatActivity
import ru.fylmr.poplibs_nov21.databinding.ActivityConverterBinding

class ConverterActivity : MvpAppCompatActivity(), ConverterView {

    private lateinit var binding: ActivityConverterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
