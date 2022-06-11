package com.adam.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.adam.affirmations.adapter.ItemAdapter
import com.adam.affirmations.data.DataSource
import com.adam.affirmations.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val TAG = "Main Acitivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataSet = DataSource().loadAffirmations()
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, dataSet)
        recyclerView.setHasFixedSize(true)

    }
}