package com.example.dadospessoais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView

class VisualizarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar_dados)

        val nome = intent.getStringExtra("Nome")
        val textViewNome = findViewById<TextView>(R.id.editTextNome)
        textViewNome.text =nome

        val email = intent.getStringExtra("Email")
        val textViewEmail = findViewById<TextView>(R.id.editTextEmail)
        textViewEmail.text =email

        val telefone = intent.getStringExtra("Telefone")
        val textViewTelefone = findViewById<TextView>(R.id.editTextTelefone)
        textViewTelefone.text =telefone

       val dataNascimento = intent.getLongExtra("Data_Nascimento",-1)
        val textViewDataNascimento = findViewById<CalendarView>(R.id.calendarViewDataNascimento)
        textViewDataNascimento.date = dataNascimento


    }
}