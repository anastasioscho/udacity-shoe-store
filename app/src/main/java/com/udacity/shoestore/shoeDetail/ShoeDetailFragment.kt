package com.udacity.shoestore.shoeDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding

class ShoeDetailFragment: Fragment() {

    private lateinit var binding: FragmentShoeDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentShoeDetailBinding.inflate(inflater, container, false)

        return binding.root
    }
}
