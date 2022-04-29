package com.example.dadospessoais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonEnviar =findViewById<Button>(R.id.buttonEnviar)
        buttonEnviar.setOnClickListener{ enviaInfo() }

    }

    private fun enviaInfo() {
        val editTextNome = findViewById<EditText>(R.id.editTextNome)
        val nome = editTextNome.text.toString()
        if (nome.isBlank()){
            editTextNome.error = getString(R.string.nome_obrigatorio)
            editTextNome.requestFocus()
            return
        }
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val email = editTextEmail.text.toString()
        if (email.isBlank()){
            editTextEmail.error = getString(R.string.email_obrigatorio)
            editTextEmail.requestFocus()
            return
        }

        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)
        val telefone = editTextTelefone
        if (telefone.){

        }


        findViewById<CalendarView>(R.id.calendarViewDataNascimento)
    }
}