package org.d3if0130.jurnaljuga

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AngkaViewModel:ViewModel() {
    private val _angkaa = MutableLiveData<Int>()
    private val _angkab = MutableLiveData<Int>()
    val angkaa : LiveData<Int>
        get() = _angkaa
    val angkab : LiveData <Int>
        get() = _angkab
    init {
        _angkaa.value = 0
        _angkab.value = 0
    }

    //Button A
    fun plusA2(){
        _angkaa.value= _angkaa.value?.plus(2)
    }

    fun plusA3(){
        _angkaa.value= _angkaa.value?.plus(3)
    }
    fun plusFreeA(){
        _angkaa.value= _angkaa.value?.plus(1)
    }

    //button B
    fun plusB2(){
        _angkab.value= _angkab.value?.plus(2)
    }

    fun plusB3(){
        _angkab.value= _angkab.value?.plus(3)
    }
    fun plusFreeB(){
        _angkab.value= _angkab.value?.plus(1)
    }

    //button reset
    fun reset(){
        _angkaa.value = 0
        _angkab.value = 0
    }
}