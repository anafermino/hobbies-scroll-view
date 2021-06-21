package com.example.fragmenthobby

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.fragmenthobby.fragments.HobbiesFragment
import com.example.fragmenthobby.fragments.RoutinesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFirstFragment()

        btnFragment1.setOnClickListener {
            loadFirstFragment()
        }

        btnFragment2.setOnClickListener {
            loadSecondFragment()
        }

    }

    private fun loadFirstFragment() {

        //Carrega o fragment
        val fragment = RoutinesFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerFragment, fragment)
            .commit()

        //Muda as cores dos botões
        btnFragment1.setTextColor(ContextCompat.getColor(this, R.color.cit_pink))
        btnFragment2.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    private fun loadSecondFragment() {
        //Muda as cores dos botões
        btnFragment1.setTextColor(ContextCompat.getColor(this, R.color.white))
        btnFragment2.setTextColor(ContextCompat.getColor(this, R.color.cit_pink))

        //Carrega a segunda fragment
        val fragment = HobbiesFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.containerFragment, fragment)
            .commit()

    }

    }
