package com.example.guadeejercicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.guadeejercicios.databinding.FragmentBicepsFragmentBinding
import com.example.guadeejercicios.databinding.FragmentHomeBinding
import com.example.guadeejercicios.databinding.FragmentSlideshowBinding
import com.example.guadeejercicios.ui.slideshow.SlideshowViewModel

class biceps_fragment : Fragment() {
    private var _binding2: FragmentBicepsFragmentBinding? = null
    private val binding get() = _binding2!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val slideshowViewModel =
            ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding2 = FragmentBicepsFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding2 = null
    }




}