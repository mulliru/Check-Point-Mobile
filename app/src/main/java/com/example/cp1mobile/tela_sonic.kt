package com.example.cp1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tela_sonic : AppCompatActivity() {
    lateinit var buttonVoltarUm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_sonic)

        //Define um listener para ouvir quando a pessoa clicar no botão de voltar

        buttonVoltarUm = findViewById(R.id.btn_voltar)
        // Define um listener de clique para o botão
        buttonVoltarUm.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val VoltarTelaUm = Intent(this, TelaDois::class.java)
            // Inicia a atividade TelaDois
            startActivity(VoltarTelaUm)
        }

        }

    }
