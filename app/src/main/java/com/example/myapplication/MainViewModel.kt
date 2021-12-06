package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController


class MainViewModel : ViewModel() {
    /*
    //var count = 0
    private val _count =MutableLiveData<Int>(0) //Mutable 変更可能な的な
    val count:LiveData<Int> = _count
    private val _san = MutableLiveData<String>("")
    val san:LiveData<String> = _san

    fun countup(){
        _count.value = count.value!! + 1 //!!ヌルじゃないよていう印
        _san.value = if (count.value!!.isMultipleof(3) || count.value!!.contains(3)) "サン！" else ""
    }

    fun reset(){
        _count.value = 0
        _san.value = ""
    }
    private fun Int.isMultipleof(value:Int):Boolean = this % value == 0


    private fun Int.contains(value:Int):Boolean = this.toString().contains(value.toString())
     */


}