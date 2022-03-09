package br.digitalhouse.fragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto : TextView
    var podeTrocar : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.button2)


        button1.setOnClickListener {
            var gerenciaFragment = supportFragmentManager.beginTransaction()
            gerenciaFragment.replace(R.id.my_container,Fragment1.criarFragment())
            gerenciaFragment.commit()
            podeTrocar = true

        }

        button2.setOnClickListener {
            var gerenciaFragment = supportFragmentManager.beginTransaction()
            gerenciaFragment.replace(R.id.my_container,Fragment2.criarFragmento())
            gerenciaFragment.commit()
        }


        texto = findViewById<TextView>(R.id.textoTrocaFragmento)
        texto.setOnClickListener {
                var gerenciaFragment = supportFragmentManager.beginTransaction()
                gerenciaFragment.replace(R.id.my_container,Fragment2.criarFragmento())
                gerenciaFragment.commit()
        }


    }


}