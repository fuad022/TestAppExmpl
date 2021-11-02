package com.example.testappexmpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testappexmpl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}