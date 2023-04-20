package com.luisdev14.loginappdesignplants

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.luisdev14.loginappdesignplants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide() // Oculta el actionBar en mi actividad

        //Initialize the UI
        initUI()

    }

    private fun initUI() {

        binding.fabBack.setOnClickListener(){
            startActivity(Intent(this@MainActivity,MainActivity::class.java))
        }

        binding.btnSignIn.setOnClickListener(){
            Toast.makeText(this, "Iniciando sesion...", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }

        binding.tvForgotPassword.setOnClickListener(){

        }

        binding.tvSignup.setOnClickListener(){

        }
    }
}