package com.ephemerayne.kls_notepad.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note

class NoteViewHolder(
    private val itemView: View,
    private val noteItemClickListener: NoteItemClickListener,
) : RecyclerView.ViewHolder(itemView) {

    fun setContent(note: Note) {
        val titleView = itemView.findViewById<TextView>(R.id.title)
        val descriptionView = itemView.findViewById<TextView>(R.id.view_description)
        titleView.text = note.title
        descriptionView.text = note.description // создан класс управляющий элементом списка
        // ViewHolder

        itemView.setOnClickListener {
            noteItemClickListener.onNoteClick(note)
        }
    }
}