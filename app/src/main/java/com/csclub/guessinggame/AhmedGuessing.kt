package com.csclub.guessinggame

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity


class AhmedGuessing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val randomValues = List(10) { Random.nextInt(0, 10) }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahmed_guessing)
        guess_button.setOnClickListener{
            var input = getText(text_box)
            if (input > ) {

            }
        }
    }
}