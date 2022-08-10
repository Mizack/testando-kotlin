package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cliqueAqui = findViewById<Button>(R.id.botao)
        val nome = findViewById<EditText>(R.id.nome)
        val resultado = findViewById<TextView>(R.id.resultado)

        cliqueAqui.setOnClickListener {
            resultado.text = concatenar(resultado,nome)
        }
    }

    fun concatenar(texto1: TextView, texto2: EditText): String {
        val texto = texto1.text
        val nomeee = texto2.editableText.toString()
        val concatenado = "$texto $nomeee"
        return concatenado
    }

    //fun onCliqueAqui(view: View){
        //Toast.makeText(this,"Clicado", Toast.LENGTH_SHORT).show()

    //}
}