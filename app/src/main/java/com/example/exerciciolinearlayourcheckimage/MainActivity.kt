package com.example.exerciciolinearlayourcheckimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SeuCheckbox.setOnClickListener {
            if (SeuCheckbox.isChecked) {
                SeuImageView.setColorFilter(resources.getColor(R.color.colorAccent))
            } else {
                SeuImageView.setColorFilter(resources.getColor(R.color.colorPrimaryDark))
            }
        }

    }

}



