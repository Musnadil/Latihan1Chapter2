package com.musnadil.latihan1chapter2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.musnadil.latihan1chapter2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        val defaultSearch = "Musnadil Firdaus"
        binding.etSearch.setText(defaultSearch)

//        val fotoProfile = binding.profile_pict
//
//        Glide.with(this)
//            .load(R.drawable.musnadil)
//            .fitCenter()
//            .circleCrop()
//            .into(fotoProfile)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}