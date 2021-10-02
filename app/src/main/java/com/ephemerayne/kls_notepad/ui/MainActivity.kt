package com.ephemerayne.kls_notepad.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * поскольку Activity следует интерфейсу  NoteItemClickListener, она (Activity) обязана реализоать его (интерфейса) метод - onNoteClick
 * */
class MainActivity : AppCompatActivity(), NoteItemClickListener {
    private lateinit var addNoteButton: FloatingActionButton
    private lateinit var recycler: RecyclerView
    private val adapter = NotesAdapter(this)

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
        addNoteButton = findViewById(R.id.add_note_button)

        recycler.adapter = adapter // устанавливаю адаптер в ресайклер
        recycler.layoutManager = LinearLayoutManager(this)
        adapter.setNotes(fakeNotes)  // передаётся массив заметок в адаптер

        addNoteButton.setOnClickListener {
            //открытие Активити
            val intent = Intent(this, NoteCreationActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onNoteClick(note: Note) {
        val intent = Intent(this, NoteViewActivity::class.java)
        intent.putExtra(NoteViewActivity.KEY_TITLE, note.title)
        intent.putExtra(NoteViewActivity.KEY_DESCRIPTION, note.description)
        startActivity(intent) // передаём в Активити дополнительные данные по Ключу
    }
}