package com.ephemerayne.kls_notepad.repository

import com.ephemerayne.kls_notepad.model.Note

interface NotesRepository {
    fun addNote(note: Note)
    fun getAllNotes(): ArrayList<Note>

}