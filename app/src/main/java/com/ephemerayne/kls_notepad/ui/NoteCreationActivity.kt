package com.ephemerayne.kls_notepad.ui

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R

class NoteCreationActivity : AppCompatActivity() {
    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var actionButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_creation)


        title = findViewById(R.id.view_title)
        description = findViewById(R.id.view_description)
        actionButton = findViewById(R.id.floating_action_button)

        actionButton.setOnClickListener{

        }


    }

} // обьявить все View в onCreate (EditText, Button), создать click на кнопку,(сохранение полей по клику в DB)