package com.example.cp1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class tela_silver : AppCompatActivity() {
    lateinit var buttonVoltarDois: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_silver)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonVoltarDois = findViewById(R.id.btn_voltar2)
        // Define um listener de clique para o botão
        buttonVoltarDois.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val VoltarTelaDois = Intent(this, TelaDois::class.java)
            // Inicia a atividade TelaDois
            startActivity(VoltarTelaDois)
        }
    }
}