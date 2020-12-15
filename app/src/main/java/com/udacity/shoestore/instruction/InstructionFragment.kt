package com.udacity.shoestore.instruction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.FragmentInstructionBinding

class InstructionFragment: Fragment() {

    private lateinit var binding: FragmentInstructionBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentInstructionBinding.inflate(inflater, container, false)

        return binding.root
    }
}
