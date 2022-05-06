package com.example.dadospessoais

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import java.util.regex.Pattern

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
        val emailValido = Patterns.EMAIL_ADDRESS.matcher(email).matches()
        if (!emailValido){
            editTextEmail.error = getString(R.string.email_invalido)
            editTextEmail.requestFocus()
            return
        }

        val editTextTelefone = findViewById<EditText>(R.id.editTextTelefone)
        val telefone = editTextTelefone.text.toString()
        if (telefone.isBlank()){
            editTextTelefone.error = getString(R.string.telefone_obrigatorio)
            editTextTelefone.requestFocus()
        }
        val telefoneValido = Patterns.PHONE.matcher(telefone).matches()
        if(!telefoneValido){
            editTextTelefone.error = getString(R.string.telefone_invalido)
            editTextTelefone.requestFocus()
            return
        }


        val calendarViewDataNascimento = findViewById<CalendarView>(R.id.calendarViewDataNascimento)
        val dataNascimento = calendarViewDataNascimento.date

        //TODO: ENVIAR DADOS PARA NOVA ATIVIDADE
        val intent = Intent(this, VisualizarDados::class.java)
        intent.putExtra(EXTRA_NOME,nome)
        intent.putExtra(EXTRA_EMAIL,email)
        intent.putExtra(EXTRA_TELEFONE,telefone)
        intent.putExtra(EXTRA_DATA_NASCIMENTO,dataNascimento)

        startActivity(intent)
    }
    companion object{
        const val EXTRA_NOME = "NOME"
        const val EXTRA_EMAIL = "EMAIL"
        const val EXTRA_TELEFONE = "TELEFONE"
        const val EXTRA_DATA_NASCIMENTO = "DATA_NASCIMENTO"

    }





}