package com.udacity.shoestore.shoeList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.udacity.shoestore.MainViewModel
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ListItemShoeBinding
import com.udacity.shoestore.models.Shoe

class ShoeListFragment: Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.shoes.observe(viewLifecycleOwner, Observer { shoes ->
            shoes?.let {
                displayShoes(it)
            }
        })

        binding.fab.setOnClickListener {
            it.findNavController().navigate(ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment())
        }
        
        return binding.root
    }

    private fun displayShoes(shoes: List<Shoe>) {
        shoes.forEach { displayShoe(it) }
    }

    private fun displayShoe(shoe: Shoe) {
        val listItemShoeBinding: ListItemShoeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_shoe, null, false)

        listItemShoeBinding.nameTextView.text = shoe.name
        listItemShoeBinding.companyTextView.text = shoe.company
        listItemShoeBinding.sizeTextView.text = shoe.size.toString()
        listItemShoeBinding.descriptionTextView.text = shoe.description

        binding.linearLayout.addView(listItemShoeBinding.root)

    }
}
