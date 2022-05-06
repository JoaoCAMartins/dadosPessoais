package com.example.dadospessoais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import java.sql.Date
import java.time.LocalDate

class VisualizarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_dados)

        val nome = intent.getStringExtra(MainActivity.EXTRA_NOME)
        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.text =nome

        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        textViewEmail.text =email

        val telefone = intent.getStringExtra(MainActivity.EXTRA_TELEFONE)
        val textViewTelefone = findViewById<TextView>(R.id.textViewTelefone)
        textViewTelefone.text =telefone

       val dataNascimento = intent.getLongExtra(MainActivity.EXTRA_DATA_NASCIMENTO,-1)
        val textViewDataNascimento = findViewById<TextView>(R.id.textViewDataNascimento)
        textViewDataNascimento.text = Date(dataNascimento).toString()






    }
}