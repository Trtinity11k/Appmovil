package com.example.guadeejercicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetalledeEjercicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detallede_ejercicio, container, false)

        // Recuperar los datos del ejercicio (nombre del ejercicio)
        val exerciseName = arguments?.getString("exercise_name")

        // Obtener las referencias a la vista
        val descriptionTextView = view.findViewById<TextView>(R.id.exerciseDescription)
        val imageView = view.findViewById<ImageView>(R.id.exerciseImage)

        // Mostrar descripción e imagen según el ejercicio seleccionado
        when (exerciseName) {
            "Sentadillas" -> {
                descriptionTextView.text = "Las sentadillas son un excelente ejercicio para fortalecer los músculos de las piernas y glúteos. Mantén la espalda recta y baja lentamente hasta que los muslos estén paralelos al suelo."
                imageView.setImageResource(R.drawable.fuerza)  // Cambia según la imagen correcta
            }
            "Prensa de Pierna" -> {
                descriptionTextView.text = "La prensa de pierna ayuda a fortalecer las piernas al empujar el peso con los pies. Es importante controlar el movimiento para evitar lesiones."
                imageView.setImageResource(R.drawable.prensa)
            }
            "Peso Muerto" -> {
                descriptionTextView.text = "El peso muerto es un ejercicio de fuerza que trabaja varios músculos, incluyendo la espalda baja y los isquiotibiales. Asegúrate de mantener la espalda recta y levantar el peso con las piernas."
                imageView.setImageResource(R.drawable.pesomuerto)
            }
            "Zancadas" -> {
                descriptionTextView.text = "Las zancadas son un gran ejercicio para mejorar el equilibrio y fortalecer los músculos de las piernas. Da un paso hacia adelante y baja el cuerpo hasta que ambas rodillas formen ángulos de 90 grados."
                imageView.setImageResource(R.drawable.zancada)
            }
            "Elevación de Talones" -> {
                descriptionTextView.text = "Este ejercicio se enfoca en fortalecer los músculos de la pantorrilla. Levántate sobre los dedos de los pies y baja lentamente para maximizar el impacto."
                imageView.setImageResource(R.drawable.elevaciondetalones)
            }
            "Dominadas" -> {
                descriptionTextView.text = "Las dominadas son un ejercicio que trabaja la parte superior del cuerpo, especialmente los músculos de la espalda y los brazos. Asegúrate de mantener el cuerpo recto mientras subes y bajas."
                imageView.setImageResource(R.drawable.dominadas)  // Cambia según la imagen correcta
            }
            "Remo con Barra" -> {
                descriptionTextView.text = "El remo con barra es excelente para desarrollar la fuerza de la espalda. Mantén la espalda recta y tira de la barra hacia tu abdomen."
                imageView.setImageResource(R.drawable.remoconbarra)
            }
            "Peso Muerto Rumano" -> {
                descriptionTextView.text = "El peso muerto rumano se centra en los isquiotibiales y la espalda baja. Mantén las piernas ligeramente flexionadas y baja la barra controladamente."
                imageView.setImageResource(R.drawable.pesomuerto)
            }
            "Jalón al Pecho" -> {
                descriptionTextView.text = "El jalón al pecho es un gran ejercicio para desarrollar la fuerza en la parte superior de la espalda. Asegúrate de contraer los músculos de la espalda mientras tiras de la barra hacia tu pecho."
                imageView.setImageResource(R.drawable.jalonpecho)
            }
            "Remo en Polea" -> {
                descriptionTextView.text = "El remo en polea trabaja los músculos de la espalda y los brazos. Mantén el torso recto y tira de la polea hacia ti."
                imageView.setImageResource(R.drawable.remoconbarra) // Cambia según la imagen correcta
            }
            "Press Militar" -> {
                descriptionTextView.text = "El press militar es un ejercicio que se centra en el desarrollo de los hombros y la parte superior del cuerpo. Realiza el movimiento de pie o sentado, manteniendo la espalda recta."
                imageView.setImageResource(R.drawable.pressmili)
            }
            "Elevaciones Laterales" -> {
                descriptionTextView.text = "Las elevaciones laterales son ideales para trabajar los músculos del hombro, especialmente el deltoides. Levanta las mancuernas hacia los lados con un ligero doblez en los codos."
                imageView.setImageResource(R.drawable.elevacionlateral)
            }
            "Elevaciones Frontales" -> {
                descriptionTextView.text = "Las elevaciones frontales ayudan a fortalecer la parte frontal de los hombros. Levanta las mancuernas frente a ti hasta la altura de los hombros."
                imageView.setImageResource(R.drawable.elefront)
            }
            "Pájaros" -> {
                descriptionTextView.text = "Los pájaros son un gran ejercicio para trabajar la parte posterior de los hombros y la espalda. Inclínate hacia adelante y levanta las mancuernas hacia los lados."
                imageView.setImageResource(R.drawable.paja)
            }
            "Remo" -> {
                descriptionTextView.text = "El remo es un ejercicio compuesto que trabaja múltiples grupos musculares. Asegúrate de mantener una buena postura mientras realizas el movimiento."
                imageView.setImageResource(R.drawable.remoconbarra)
            }
        }

        return view
    }
}
