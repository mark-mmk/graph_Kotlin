package com.example.graph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var btnNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        navController = findNavController(R.id.nav_host_fragment)
        btnNav = findViewById(R.id.bottomnavigation)
        btnNav.setupWithNavController(navController)

//        btnNav.setOnItemSelectedListener {
//            when(it.itemId){
//                R.id.frame1 -> {
//                    navController.navigate(R.id.frame1)
//                    true
//                }
//                R.id.frame2 -> {
//                    navController.navigate(R.id.frame2)
//                    true
//                }
//                R.id.frame3 -> {
//                    navController.navigate(R.id.frame3)
//                    true
//                }
//                else -> {
//                    true
//                }
//            }
//        }
    }
}