package com.ephemerayne.kls_notepad.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var addNoteButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addNoteButton = findViewById(R.id.add_note_button)
        addNoteButton.setOnClickListener {
            //открытие Активити
            val intent = Intent(this, NoteCreationActivity::class.java)
            startActivity(intent)
        }
    }
}