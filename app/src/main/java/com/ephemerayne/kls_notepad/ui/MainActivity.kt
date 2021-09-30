package com.ephemerayne.kls_notepad.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var addNoteButton: FloatingActionButton
    lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * это устанавливает макет. У тебя должен быть макет Менй Активити
         * как на 17 строчке.
         *
         * А ты пытаешься еще поставить из другого активити макет.
         *
         * делай верстку. Открытие нормлаьно сделал как надо.
         * */
//
        addNoteButton = findViewById(R.id.add_note_button)
        addNoteButton.setOnClickListener {
            //открытие Активити
            val intent = Intent(this, NoteCreationActivity::class.java)
            startActivity(intent)
        }

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, NoteViewActivity::class.java)
            startActivity(intent)
        }

    }
}