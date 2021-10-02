package com.ephemerayne.kls_notepad.ui

import com.ephemerayne.kls_notepad.model.Note

interface NoteItemClickListener {
    fun onNoteClick(note: Note)
}