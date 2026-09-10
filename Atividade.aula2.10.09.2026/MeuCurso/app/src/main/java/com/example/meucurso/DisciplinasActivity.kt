package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        // Mapeando botões
        val btnProgramacao = findViewById<Button>(R.id.btnProgramacao)
        val btnBancoDados = findViewById<Button>(R.id.btnBancoDados)
        val btnEngenharia = findViewById<Button>(R.id.btnEngenharia)
        val btnWeb = findViewById<Button>(R.id.btnWeb)
        val btnMobile = findViewById<Button>(R.id.btnMobile)
        val btnIA = findViewById<Button>(R.id.btnIA)
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDisciplinas)

        // Eventos de clique para enviar informações
        btnProgramacao.setOnClickListener {
            abrirDetalhes(
                nome = "Programação",
                carga = "80 horas",
                modalidade = "Presencial",
                nivel = "Iniciante",
                professor = "Prof. Carlos Eduardo",
                descricao = "Estudo dos fundamentos da lógica de programação e algoritmos estruturados com Kotlin."
            )
        }

        btnBancoDados.setOnClickListener {
            abrirDetalhes(
                nome = "Banco de Dados",
                carga = "60 horas",
                modalidade = "Presencial",
                nivel = "Intermediário",
                professor = "Profa. Renata Lima",
                descricao = "Modelagem relacional, linguagem SQL e introdução a bancos de dados NoSQL."
            )
        }

        btnEngenharia.setOnClickListener {
            abrirDetalhes(
                nome = "Engenharia de Software",
                carga = "60 horas",
                modalidade = "EAD",
                nivel = "Intermediário",
                professor = "Prof. Leandro Melo",
                descricao = "Conceitos de ciclo de vida do software, metodologias ágeis (Scrum/Kanban) e UML."
            )
        }

        btnWeb.setOnClickListener {
            abrirDetalhes(
                nome = "Desenvolvimento Web",
                carga = "80 horas",
                modalidade = "Presencial",
                nivel = "Intermediário",
                professor = "Prof. André Santos",
                descricao = "Construção de aplicações web modernas com HTML5, CSS3, JavaScript e APIs REST."
            )
        }

        btnMobile.setOnClickListener {
            abrirDetalhes(
                nome = "Desenvolvimento Mobile",
                carga = "80 horas",
                modalidade = "Presencial",
                nivel = "Avançado",
                professor = "Prof. Leandro Melo",
                descricao = "Estudo e prática na construção de aplicativos Android nativos com Kotlin e Android Studio."
            )
        }

        btnIA.setOnClickListener {
            abrirDetalhes(
                nome = "Inteligência Artificial",
                carga = "40 horas",
                modalidade = "EAD",
                nivel = "Avançado",
                professor = "Profa. Juliana Mendes",
                descricao = "Conceitos de redes neurais, aprendizado de máquina e integração de LLMs em software."
            )
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }

    // Função auxiliar para centralizar a criação da Intent e passagem de dados
    private fun abrirDetalhes(
        nome: String,
        carga: String,
        modalidade: String,
        nivel: String,
        professor: String,
        descricao: String
    ) {
        val intent = Intent(this, DetalhesDisciplinaActivity::class.java).apply {
            putExtra("EXTRA_NOME", nome)
            putExtra("EXTRA_CARGA", carga)
            putExtra("EXTRA_MODALIDADE", modalidade)
            putExtra("EXTRA_NIVEL", nivel)
            putExtra("EXTRA_PROFESSOR", professor)
            putExtra("EXTRA_DESCRICAO", descricao)
        }
        startActivity(intent)
    }
}