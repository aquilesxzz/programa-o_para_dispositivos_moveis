package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SobreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinasSobre)
        val btnVoltar = findViewById<Button>(R.id.btnVoltarSobre)

        btnDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}