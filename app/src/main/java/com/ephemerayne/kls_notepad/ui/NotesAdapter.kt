package com.ephemerayne.kls_notepad.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ephemerayne.kls_notepad.R
import com.ephemerayne.kls_notepad.model.Note

class NotesAdapter(
    private val noteItemClickListener: NoteItemClickListener,
) : RecyclerView.Adapter<NoteViewHolder>() {
    private val notes: ArrayList<Note> = ArrayList()

    fun setNotes(notes: List<Note>) {
        this.notes.clear()
        this.notes.addAll(notes)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.note_item,
                parent,
                false,
            ),
            noteItemClickListener,
        ) // "раздули" макет для item
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.setContent(note) // передали обьек note в соответствующий ViewHolder
    }

    override fun getItemCount(): Int {
       return notes.size
    } // кол - во notes в списке
}