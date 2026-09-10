package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesDisciplinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        // Mapeando views
        val txtNome = findViewById<TextView>(R.id.txtNomeDisciplina)
        val txtCarga = findViewById<TextView>(R.id.txtCargaHoraria)
        val txtModalidade = findViewById<TextView>(R.id.txtModalidade)
        val txtNivel = findViewById<TextView>(R.id.txtNivel)
        val txtProfessor = findViewById<TextView>(R.id.txtProfessor)
        val txtDescricao = findViewById<TextView>(R.id.txtDescricao)
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDetalhes)
        val btnIrHome = findViewById<Button>(R.id.btnIrHome)

        // Recebendo os dados extras da Intent
        val nome = intent.getStringExtra("EXTRA_NOME") ?: "Disciplina"
        val carga = intent.getStringExtra("EXTRA_CARGA") ?: "N/A"
        val modalidade = intent.getStringExtra("EXTRA_MODALIDADE") ?: "N/A"
        val nivel = intent.getStringExtra("EXTRA_NIVEL") ?: "N/A"
        val professor = intent.getStringExtra("EXTRA_PROFESSOR") ?: "N/A"
        val descricao = intent.getStringExtra("EXTRA_DESCRICAO") ?: "Sem descrição."

        // Atualizando o texto dos componentes
        txtNome.text = nome
        txtCarga.text = "Carga horária: $carga"
        txtModalidade.text = "Modalidade: $modalidade"
        txtNivel.text = "Nível: $nivel"
        txtProfessor.text = "Professor: $professor"
        txtDescricao.text = descricao

        // Ação do botão voltar (fecha a tela atual e retorna para a lista)
        btnVoltar.setOnClickListener {
            finish()
        }

        // Ação da Melhoria Própria: Volta direto para a Home limpando a pilha de telas
        btnIrHome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}