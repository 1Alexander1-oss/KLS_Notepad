package com.ephemerayne.kls_notepad.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var addNoteButton: FloatingActionButton
    lateinit var recycler: RecyclerView
    private val fakeNotes: List<Note> = listOf(
        Note(title = "посчитать бабло", description = "много бобла"),
        Note(title = "пойти в магазин", description = "купить хлеба"),
        Note(title = "осада", description = "соль"),
        Note(title = "арбузы", description = "вкусные"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler = findViewById(R.id.recycler)
        val adapter = NotesAdapter()
        recycler.adapter = adapter // устанавливаю адаптер в ресайклер
        recycler.layoutManager = LinearLayoutManager(this)
        adapter.setNotes(fakeNotes)

        addNoteButton = findViewById(R.id.add_note_button)
        addNoteButton.setOnClickListener {
            //открытие Активити
            val intent = Intent(this, NoteCreationActivity::class.java)
            startActivity(intent)
        }
    }
}