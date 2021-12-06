package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.core.view.get
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

class FragmentFirst : Fragment() {
    private val viewModel: FirstViewModel by viewModels()
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { //viewが作られた後
        super.onViewCreated(view, savedInstanceState)

        binding.idoubutton.setOnClickListener {
            if (viewModel.next(binding.whatnext.text.toString()) == 1) {
                findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond)

            }
        }

        binding.buttonNext.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond)
            //findNavController().navigateUp()で戻る
        }

        binding.buttonNext2.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond2)
            //findNavController().navigateUp()で戻る
        }
    }

}