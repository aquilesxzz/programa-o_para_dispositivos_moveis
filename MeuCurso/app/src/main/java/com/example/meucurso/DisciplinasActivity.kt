package com.example.meucurso

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        val btnVoltar = findViewById<Button>(R.id.btnVoltarDisciplinas)

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}