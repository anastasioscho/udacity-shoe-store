package com.udacity.shoestore.shoeList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel(application: Application): AndroidViewModel(application) {

    private val _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>>
        get() = _shoes

    init {
        _shoes.value = createSampleShoes()
    }

    private fun createSampleShoes(): List<Shoe> {
        val tempShoes = mutableListOf<Shoe>()

        tempShoes.add(Shoe("Shoe 1", 10.0, "Company 1", "Description 1"))
        tempShoes.add(Shoe("Shoe 2", 20.0, "Company 2", "Description 2"))
        tempShoes.add(Shoe("Shoe 3", 30.0, "Company 3", "Description 3"))
        tempShoes.add(Shoe("Shoe 4", 40.0, "Company 4", "Description 4"))
        tempShoes.add(Shoe("Shoe 5", 50.0, "Company 5", "Description 5"))

        return tempShoes
    }
}
