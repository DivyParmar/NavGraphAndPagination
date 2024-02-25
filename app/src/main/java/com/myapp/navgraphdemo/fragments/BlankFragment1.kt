package com.myapp.navgraphdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.myapp.navgraphdemo.R
import com.myapp.navgraphdemo.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {

    lateinit var binding: FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentBlank1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tvOne.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("myName", "Divy D Parmar")
//            findNavController().popBackStack()
//            findNavController().navigate(R.id.navTwo,bundle)
            findNavController().navigate(BlankFragment1Directions.actionNavOneToNavTwo("Divy D Parmar"))
        }
    }
}