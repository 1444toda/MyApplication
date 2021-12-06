package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        binding.text.textSize=60f
        binding.text.text = viewModel.count.value.toString()
        binding.text2.text = viewModel.san.value
        //binding.text.text = double (3).toString() //binding.○○.text  //.toString()でstring型で返す

        binding.button1.setOnClickListener {
            viewModel.countup()
            binding.text.textSize=60f
//            binding.text.text = viewModel.count.toString()
//            binding.text2.text = viewModel.san

        }
        binding.button2.setOnClickListener {
            viewModel.reset()
//            binding.text.text = viewModel.count.toString()
//            binding.text2.text = viewModel.san
            //関心の分離
        }

        viewModel.count.observe(this) {
            binding.text.textSize=60f
            binding.text.text = it.toString()
        }
        viewModel.san.observe(this) {
            binding.text2.text = it
        }

         */
    }
    /*//1文だけだったらreturnが省略できる
    private fun double(value:Int):Int{
        if (value + 1 > 60000){
            return 0
        }
        return value + 1
        //return if (value * value > 60000) 2 else value * value
    }
    //private fun double(value:Int):Int = if (value * value > 60000) 2 else value * value
    private fun san(value:Int):String{
        var i = value
        while (i > 0){
            if(i % 10 == 3) {
                return "サン！"
                break
            }
            i /= 10
        }
        if (value % 3 == 0){
            return "サン！"
        }
        return ""
    }*/


}