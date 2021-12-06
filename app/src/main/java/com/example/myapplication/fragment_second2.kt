package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSecond2Binding

class fragment_second2 : Fragment() {

    private var _binding: FragmentSecond2Binding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecond2Binding.inflate(inflater,container,false)
        return binding.root
        //return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //viewが作られた後
        super.onViewCreated(view, savedInstanceState)

        binding.backbutton.setOnClickListener {
            //findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond)
            findNavController().navigateUp()
        }
    }
}