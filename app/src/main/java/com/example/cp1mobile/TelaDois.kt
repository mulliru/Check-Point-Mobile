package com.example.cp1mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TelaDois : AppCompatActivity() {
    lateinit var buttonShadow: Button
    lateinit var buttonSonic: Button
    lateinit var buttonSilver: Button
    lateinit var buttonBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tela_dois)



        // Inicializa a variável imageShadow com a ImageView do layout
        var imageShadow: ImageView = findViewById(R.id.img_shadow)

        // Define um listener para aplicar as margens das barras do sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            // Obtém as margens das barras do sistema
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            // Define o padding da view com as margens das barras do sistema
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonShadow = findViewById(R.id.btnShadow)
        // Define um listener de clique para o botão
        buttonShadow.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val NavegarTelaShadow = Intent(this, tela_shadow::class.java)
            // Inicia a atividade TelaDois
            startActivity(NavegarTelaShadow)
        }

        buttonSonic= findViewById(R.id.btnSonic)
        // Define um listener de clique para o botão
        buttonSonic.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val NavegarTelaSonic = Intent(this, tela_sonic::class.java)
            // Inicia a atividade TelaDois
            startActivity(NavegarTelaSonic)
        }

        buttonSilver= findViewById(R.id.btnSilver)
        // Define um listener de clique para o botão
        buttonSilver.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val NavegarTelaSilver = Intent(this, tela_silver::class.java)
            // Inicia a atividade TelaDois
            startActivity(NavegarTelaSilver)
        }

        buttonBack= findViewById(R.id.btnVoltar)
        // Define um listener de clique para o botão
        buttonBack.setOnClickListener {
            // Cria uma intenção para navegar para a TelaDois
            val VoltarTelaInicial = Intent(this, MainActivity::class.java)
            // Inicia a atividade TelaDois
            startActivity(VoltarTelaInicial)
        }

    }
}