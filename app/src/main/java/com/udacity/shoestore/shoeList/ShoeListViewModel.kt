package com.udacity.shoestore.shoeList

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import timber.log.Timber

class ShoeListViewModel(application: Application): AndroidViewModel(application) {

    init {
        Timber.tag("hello").d("ShoeListViewModel initialized")
    }
}
