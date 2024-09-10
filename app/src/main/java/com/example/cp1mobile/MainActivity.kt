package com.example.cp1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    // Declaração tardia da variável buttonAvancar do tipo Button
    lateinit var buttonAvancar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Habilita o modo de borda a borda
        enableEdgeToEdge()
        // Define o layout da atividade
        setContentView(R.layout.activity_main)

        // Inicializa a variável buttonAvancar com o botão do layout
        buttonAvancar = findViewById(R.id.btnProximaPagina)
        // Define um listener de clique para o botão
        buttonAvancar.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val NavegarTelaInicial = Intent(this, TelaDois::class.java)
            // Inicia a atividade TelaDois
            startActivity(NavegarTelaInicial)
        }
    }
}