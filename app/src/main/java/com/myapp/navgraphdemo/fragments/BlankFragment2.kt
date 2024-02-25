package com.myapp.navgraphdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.myapp.navgraphdemo.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

   lateinit var binding: FragmentBlank2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myName = arguments?.getString("name")
        Toast.makeText(requireActivity(),"MyName is $myName",Toast.LENGTH_LONG).show()

        binding.tvTwo.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}