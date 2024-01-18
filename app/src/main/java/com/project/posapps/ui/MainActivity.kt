package com.project.posapps.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.posapps.R
import com.project.posapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }
}