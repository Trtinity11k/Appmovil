package com.example.guadeejercicios.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.guadeejercicios.databinding.FragmentSlideshowBinding
import com.example.guadeejercicios.R

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar clics de los botones y navegar al fragmento de detalles con la información necesaria
        binding.btnDominadas.setOnClickListener {
            navigateToExerciseDetail("Dominadas", R.drawable.dominadas)
        }

        binding.btnRemoBarra.setOnClickListener {
            navigateToExerciseDetail("Remo con Barra", R.drawable.remoconbarra)
        }

        binding.btnPesoMuertoRumano.setOnClickListener {
            navigateToExerciseDetail("Peso Muerto Rumano", R.drawable.pesomuerto)
        }

        binding.btnJalonPecho.setOnClickListener {
            navigateToExerciseDetail("Jalón al Pecho", R.drawable.jalonpecho)
        }

        binding.btnRemoPolea.setOnClickListener {
            navigateToExerciseDetail("Remo en Polea", R.drawable.remoconbarra) // Asumiendo que es la misma imagen, puedes cambiarla si es necesario.
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
