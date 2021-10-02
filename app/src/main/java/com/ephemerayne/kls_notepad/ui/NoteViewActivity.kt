package com.ephemerayne.kls_notepad.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note

class NoteViewActivity : AppCompatActivity() {
    companion object{
        const val KEY_TITLE = "KEY_TITLE"
        const val KEY_DESCRIPTION = "KEY_DESCRIPTION" // создание ключа для последующей передачи значений по ключу
    }

    private lateinit var title: TextView
    private lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_view)

        val note = Note(
            title = intent.getStringExtra(KEY_TITLE).orEmpty(),
            description = intent.getStringExtra(KEY_DESCRIPTION).orEmpty() // получение значения по ключу
        )

        title = findViewById(R.id.title)
        title.text = note.title
        description = findViewById(R.id.view_description)
        description.text = note.description

    }

}