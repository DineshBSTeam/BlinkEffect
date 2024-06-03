package com.learn.blinkeffectexample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val click :TextView  = findViewById(R.id.textProducts)
        click.setOnClickListener({
//            val intent = Intent(this, Ban::class.java)
//            intent.putExtra("LEAD_ID", leadDetailData.value?.leadId)
//            startActivity(intent)
        })
    }
}