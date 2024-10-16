package com.example.guadeejercicios.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.guadeejercicios.databinding.FragmentGalleryBinding
import com.example.guadeejercicios.R

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configurar clics de los botones y navegar al fragmento de detalles con la información necesaria
        binding.btnSentadillas.setOnClickListener {
            navigateToExerciseDetail("Sentadillas", R.drawable.fuerza)
        }

        binding.btnPrensaPierna.setOnClickListener {
            navigateToExerciseDetail("Prensa de Pierna", R.drawable.prensa)
        }

        binding.btnPesoMuerto.setOnClickListener {
            navigateToExerciseDetail("Peso Muerto", R.drawable.pesomuerto)
        }

        binding.btnZancadas.setOnClickListener {
            navigateToExerciseDetail("Zancadas", R.drawable.zancada)
        }

        binding.btnElevacionTalones.setOnClickListener {
            navigateToExerciseDetail("Elevación de Talones", R.drawable.elevaciondetalones)
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
