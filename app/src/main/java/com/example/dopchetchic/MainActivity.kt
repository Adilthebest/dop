package com.example.dopchetchic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dopchetchic.databinding.ActivityMainBinding
import kotlin.coroutines.EmptyCoroutineContext.plus

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick()
    }

    private fun initClick() {
        binding.incrementBtn.setOnClickListener {
            count++
            binding.counterTv.text = count.toString()
            binding.decrementBtn.setOnClickListener {
                count--
                binding.counterTv.text = count.toString()
            }

        }
    }
}

