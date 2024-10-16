package com.example.guadeejercicios.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.guadeejercicios.databinding.FragmentHomeBinding
import com.example.guadeejercicios.R

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar clics de los botones y navegar al fragmento de detalles con la información necesaria
        binding.btnPressMilitar.setOnClickListener {
            navigateToExerciseDetail("Press Militar", R.drawable.pressmili)
        }

        binding.btnElevacionesLaterales.setOnClickListener {
            navigateToExerciseDetail("Elevaciones Laterales", R.drawable.elevacionlateral)
        }

        binding.btnElevacionesFrontales.setOnClickListener {
            navigateToExerciseDetail("Elevaciones Frontales", R.drawable.elefront)
        }

        binding.btnPajaros.setOnClickListener {
            navigateToExerciseDetail("Pájaros", R.drawable.paja)
        }

        binding.btnRemo.setOnClickListener {
            navigateToExerciseDetail("Remo", R.drawable.remoconbarra)
        }

        return root
    }

    private fun navigateToExerciseDetail(exerciseName: String, exerciseImage: Int) {
        // Crear el bundle con el nombre del ejercicio y la imagen
        val bundle = Bundle().apply {
            putString("exercise_name", exerciseName)
            putInt("exercise_image", exerciseImage)
        }

        // Navegar usando Navigation Component
        findNavController().navigate(R.id.detalledeEjercicio, bundle)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
