package com.example.volado_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var nVolado = java.util.Random()
    var valorVolado = nVolado.nextBoolean()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bActivar.setOnClickListener{
            Volado()
        }
    }
    fun Volado(){
        if (valorVolado == true){
            ivMoneda.setImageResource(R.drawable.aguilapesos)
            valorVolado = nVolado.nextBoolean()
        }else{
            ivMoneda.setImageResource(R.drawable.solpesos)
            valorVolado = nVolado.nextBoolean()
        }
    }
}

