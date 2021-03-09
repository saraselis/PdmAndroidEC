package saraestudos.iesb.calculadorapdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan
import kotlin.math.log10
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.round

class MainActivity : AppCompatActivity() {
    var isNewOp = true
    var oldNumber = ""
    var op = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numEvent(view: View) {
        if (isNewOp)
            editText.setText("")
        isNewOp = false
        var btclick = editText.text.toString()
        var btselect = view as Button

        when (btselect.id) {
            bt0.id -> {btclick += "0"}
            bt1.id -> {btclick += "1"}
            bt2.id -> {btclick += "2"}
            bt3.id -> {btclick += "3"}
            bt4.id -> {btclick += "4"}
            bt5.id -> {btclick += "5"}
            bt6.id -> {btclick += "6"}
            bt7.id -> {btclick += "7"}
            bt8.id -> {btclick += "8"}
            bt9.id -> {btclick += "9"}
            btpi.id -> {btclick += "3.14"}
            btPonto.id -> {btclick += "."}
            btMaisMenos.id -> {btclick = "-$btclick"}
        }
        editText.setText(btclick)
    }

    fun operatorEvent(view: View) {
        isNewOp = true
        oldNumber = editText.text.toString()

        var btselect = view as Button

        when (btselect.id) {
            btMulti.id -> {op = "*"}
            btMais.id -> {op = "+"}
            btMenos.id -> { op = "-"}
            btDiv.id -> {op = "/"}

        }
    }

    fun igualEvent(view: View) {
        var newNumber = editText.text.toString()
        var resultado = 0.0

        when (op) {
            "+" -> {resultado = oldNumber.toDouble() + newNumber.toDouble()}
            "-" -> {resultado = oldNumber.toDouble() - newNumber.toDouble()}
            "*" -> {resultado = oldNumber.toDouble() * newNumber.toDouble()}
            "/" -> {resultado = oldNumber.toDouble() / newNumber.toDouble()}
        }
        editText.setText(resultado.toString())
    }

    fun clearEvent(view: View) {
        editText.setText("0")
        isNewOp = true
    }

    fun percentEvent(view: View){
        var no = editText.text.toString().toDouble() / 100
        editText.setText(no.toString())
        isNewOp = true
    }

    fun raiz(view: View){
        var num = editText.text.toString().toDouble()
        var num_raiz = sqrt(num)
        editText.setText(num_raiz.toString())
    }

    fun sinFun(view: View){
        var num = editText.text.toString().toDouble()
        var num_raiz = sin(num)
        editText.setText(num_raiz.toString())
    }

    fun cosFun(view: View) {
        var num = editText.text.toString().toDouble()
        var num_raiz = cos(num)
        editText.setText(num_raiz.toString())
    }

    fun tanFun(view: View) {
        var num = editText.text.toString().toDouble()
        var num_raiz = tan(num)
        editText.setText(num_raiz.toString())
    }

    fun logFun(view: View) {
        var num = editText.text.toString().toDouble()
        var num_raiz = log10(num)
        editText.setText(num_raiz.toString())
    }

    fun powFun(view: View) {
        var num = editText.text.toString().toDouble()
        var result = num * num
        editText.setText(result.toString())
    }

    fun eulerFun(view: View){
        var num = editText.text.toString().toDouble()
        var num_raiz = exp(num)
        editText.setText(num_raiz.toString())
    }

    fun lnFun(view: View){
        var num = editText.text.toString().toDouble()
        var num_raiz = ln(num)
        editText.setText(num_raiz.toString())
    }

    fun RoundFun(view: View){
        var num = editText.text.toString().toDouble()
        var num_raiz = round(num)
        editText.setText(num_raiz.toString())
    }

    fun negNum(view: View){
        var num = editText.text.toString().toDouble()
        var result = num * -1
        editText.setText(result.toString())
    }

    fun delString(view: View) {
        var seqTela = editText.text.toString()
        if (seqTela.length > 0){
            var seqTelaDel = seqTela.substring(0, seqTela.length -1)
            editText.setText(seqTelaDel.toString())

            if (seqTelaDel.length == 0){
                editText.setText("0")
                isNewOp = true
            }

        }
    }

}






//        val btclick = findViewById(R.id.editText) as TextView
//        btclick.text = "Texto alterado"