package com.example.appzheimer_ciclo_4_grupo_3_equipo_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appzheimer_ciclo_4_grupo_3_equipo_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme((R.style.Theme_Appzheimer_Ciclo_4_Grupo_3_Equipo_3))
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
    }
}