package com.example.examenpmd

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

   /* companion object {
        const val LISTA=""
        const val NUMERO = ""


    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val b1 = findViewById<TextView>(R.id.b1)
        val b2 = findViewById<TextView>(R.id.b2)
        val b3 = findViewById<TextView>(R.id.b3)
        val tv1= findViewById<TextView>(R.id.tv1)
        val lista = mutableListOf("Hola", "que", "tal")
        val contenidoEditText=3







        b1.setOnClickListener {
            var tam=0
        for (i in lista){
            tam=i.length

            lista += tam.toString()
            lista+="\n"




        }

            b2.setOnClickListener {

                val listaAux=lista
                //lista.drop(0)

                for(i in lista){

                    if(i.length>listaAux[0].length) {
                        lista.add(0, i)
                        lista.add(1,"\n")

                    }else{

                        if(i.length>listaAux[0].length){
                            lista.add(2, i)
                            lista.add(3,"\n")

                        }
                        else {
                            lista.add(4, i)
                            lista.add(5, "\n")
                        }


                    }


                }

                tv1.text=lista.toString()


            }

            b3.setOnClickListener {
                var contador=0

                for(i in lista) {
                    if (i.length < contenidoEditText)
                        lista.drop(contador)
                    contador++
                }

                tv1.text=lista.toString()
            }





        }


    }
}

//Funcion para separar split