package ru.gravitana.gb_andrdev_lesson_03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gravitana.gb_andrdev_lesson_03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.artistName.text = "The Beatles"
        binding.trackName.text = "A Hard Day's Night"
    }
}