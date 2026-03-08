package com.example.lab05_sample

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgHome: ImageView = findViewById(R.id.imgHome)
        val imgUser: ImageView = findViewById(R.id.imgUser)

        val fragmentHome = HomeFragment()
        val fragmentUser = UserFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView2, fragmentHome)
            .commit()

        imgUser.setOnClickListener {

            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.selected_user)

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, fragmentUser)
                .commit()
        }

        imgHome.setOnClickListener {

            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.unselected_user)

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView2, fragmentHome)
                .commit()
        }
    }
}