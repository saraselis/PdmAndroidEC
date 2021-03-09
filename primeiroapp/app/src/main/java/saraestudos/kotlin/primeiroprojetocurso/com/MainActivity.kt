package saraestudos.kotlin.primeiroprojetocurso.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
//import kotlin.random.Random
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btJogar.setOnClickListener{
            jogar()
        }
    }

    private fun jogar(){
        val strBalao: String = "Numero sorteado: " + caixaNumero.text.toString()
//        caixaNumero.setText("aaaa") Troca oq na caixa
        Toast.makeText(this, strBalao, Toast.LENGTH_LONG).show()
    }

    fun cliqueBotao(view: View){
        Log.i("BOTAO","Botao foi presionado")

//        var textoExibicaoString = findViewById(R.id.textoExibicao) as TextView
//        textoExibicaoString.setText("Texto alterado")

        var textoSorteioString = findViewById(R.id.textoSorteio) as TextView

        var numeroSorteado: Int = Random().nextInt(11)

        textoSorteioString.setText("Numero sorteado: $numeroSorteado")
    }

}

