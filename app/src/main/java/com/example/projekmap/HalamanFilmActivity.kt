package com.example.projekmap

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HalamanFilmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_film)

        // Temukan ImageView untuk Film 1
        val ivFilm1: ImageView = findViewById(R.id.ivFilm1)

        // Tambahkan onClickListener untuk Film 1
        ivFilm1.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 1
            navigateToFilmDetail("Film 1")
        }

        // Temukan ImageView untuk Film 2
        val ivFilm2: ImageView = findViewById(R.id.ivFilm2)

        // Tambahkan onClickListener untuk Film 2
        ivFilm2.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 2
            navigateToFilmDetail("Film 2")
        }

        // Temukan ImageView untuk Film 3
        val ivFilm3: ImageView = findViewById(R.id.ivFilm3)

        // Tambahkan onClickListener untuk Film 3
        ivFilm3.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 3
            navigateToFilmDetail("Film 3")
        }

        // Temukan ImageView untuk Film 4
        val ivFilm4: ImageView = findViewById(R.id.ivFilm4)

        // Tambahkan onClickListener untuk Film 4
        ivFilm4.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 4
            navigateToFilmDetail("Film 4")
        }

        // Temukan ImageView untuk Film 5
        val ivFilm5: ImageView = findViewById(R.id.ivFilm5)

        // Tambahkan onClickListener untuk Film 5
        ivFilm5.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 5
            navigateToFilmDetail("Film 5")
        }

        // Temukan ImageView untuk Film 6
        val ivFilm6: ImageView = findViewById(R.id.ivFilm6)

        // Tambahkan onClickListener untuk Film 6
        ivFilm6.setOnClickListener {
            // Panggil fungsi untuk menangani klik pada Film 6
            navigateToFilmDetail("Film 6")
        }

    }

    // Fungsi untuk menangani klik pada Film
    private fun navigateToFilmDetail(filmName: String) {
        // Tentukan tujuan halaman berdasarkan film yang diklik
        val destinationClass = when (filmName) {
            "Film 1" -> Film1Activity::class.java
            "Film 2" -> Film2Activity::class.java
            "Film 3" -> Film3Activity::class.java
            "Film 4" -> Film4Activity::class.java
            "Film 5" -> Film5Activity::class.java
            "Film 6" -> Film6Activity::class.java
            else -> null
        }

        // Jika tujuan halaman ditemukan, buat Intent dan mulai aktivitas baru
        destinationClass?.let {
            val intent = Intent(this, it)
            intent.putExtra("filmName", filmName)
            startActivity(intent)
        }
    }
}