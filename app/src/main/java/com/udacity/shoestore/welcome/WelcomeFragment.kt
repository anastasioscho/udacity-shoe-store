package com.udacity.shoestore.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.MainViewModel
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment: Fragment() {

    private lateinit var binding: FragmentWelcomeBinding
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false)

        binding.viewModel = viewModel

        viewModel.eventShowInstructionScreen.observe(viewLifecycleOwner, Observer { showInstructionScreen ->
            showInstructionScreen?.let {
                if (it) {
                    findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToInstructionFragment())

                    viewModel.onEventShowInstructionScreenComplete()
                }
            }
        })

        return binding.root
    }
}
