package com.ephemerayne.kls_notepad.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note

class NoteViewActivity : AppCompatActivity() {
    private lateinit var title: TextView
    private lateinit var description: TextView
    private lateinit var note: Note

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        note = Note(title = "@string/title", description = "@string/description")
        setContentView(R.layout.activity_note_view)
        title = findViewById(R.id.title)
        title.text = note.title
        description = findViewById(R.id.view_description)
        description.text = note.description

    }

}