package com.natasin.thesheep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.natasin.thesheep.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {




    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setTheme(R.style.Theme_OsCarneirinhos)
        setContentView(R.layout.activity_main)
    }
    fun counteBtn (view : View) {
        clickCount ++
      val textView = findViewById(R.id.textView) as TextView
        textView.text = "Click para contar os carneiros : $clickCount CONTADOS"
    }




}
