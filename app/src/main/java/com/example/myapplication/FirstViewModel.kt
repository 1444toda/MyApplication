package com.example.myapplication

import androidx.lifecycle.ViewModel


class FirstViewModel : ViewModel() {


    fun next(value:String):Int{
        return if (value.contains(3)) 1 else 0
    }

    private fun String.contains(value:Int):Boolean = this.contains(value.toString())

}