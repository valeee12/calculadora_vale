package cl.yhf.calculadoravale

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operacion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN1.setOnClickListener { numeroPresionado("1") }
        BTN2.setOnClickListener { numeroPresionado("2") }
        BTN3.setOnClickListener { numeroPresionado("3") }
        BTN4.setOnClickListener { numeroPresionado("4") }
        BTN5.setOnClickListener { numeroPresionado("5") }
        BTN6.setOnClickListener { numeroPresionado("6") }
        BTN7.setOnClickListener { numeroPresionado("7") }
        BTN8.setOnClickListener { numeroPresionado("8") }
        BTN9.setOnClickListener { numeroPresionado("9") }
        BTN0.setOnClickListener { numeroPresionado("0") }

        BTNSUMA.setOnClickListener { operacionPresionada(SUMA) }
        BTNRESTA.setOnClickListener { operacionPresionada(RESTA) }
        BTNMULTI.setOnClickListener { operacionPresionada(MULT) }
        BTNDIVIDIR.setOnClickListener { operacionPresionada(DIV) }

        BTNBORRAR.setOnClickListener{
            num1 = 0.0
            num2 = 0.0
            TXTRESULTADO.text = "0"
            operacion= NO_OPERACION
        }

        BTNIGUAL.setOnClickListener {
            var resultado = when (operacion) {
                SUMA -> num1 + num2
                RESTA -> num1 - num2
                MULT -> num1 * num2
                DIV -> num1 / num2
                else -> 0
            }
            TXTRESULTADO.text = resultado.toString()
        }

    }

    fun numeroPresionado(digito: String) {
        TXTRESULTADO.text = "${TXTRESULTADO.text}$digito"
    }
    private fun numeroPresionado(digito: String){
        if(operacion== NO_OPERACION){


        }
    }

    private fun operacionPresionada(operacion: Int) {
        this.operacion = operacion

        num1 = TXTRESULTADO.text.toString().toDouble()
        TXTRESULTADO.text = "0"
    }

    companion object {
        const val SUMA = 1
        const val RESTA = 2
        const val MULT = 3
        const val DIV = 4
        const val NO_OPERACION = 0
    }

}



