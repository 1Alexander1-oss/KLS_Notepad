package com.ephemerayne.kls_notepad.repository

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns._ID
import com.ephemerayne.kls_notepad.database.NoteDataBase
import com.ephemerayne.kls_notepad.database.NoteDataBaseHelper
import com.ephemerayne.kls_notepad.model.Note

class SqlRepository(dbHelper: NoteDataBaseHelper) :
    NotesRepository { // реализация добавления и отображения списка заметок

    private val database: SQLiteDatabase? = dbHelper.writableDatabase
    private lateinit var contentValues: ContentValues

    override fun addNote(note: Note) {
        val title = note.title
        val description = note.description
        contentValues.put(NoteDataBase.COLUMN_NAME_TITLE, title)
        contentValues.put(NoteDataBase.COLUMN_NAME_DESCRIPTION, description)

        database?.insert(NoteDataBase.DATABASE_NAME, null, contentValues)
    }

    override fun getAllNotes(): ArrayList<Note> {
        val notes: ArrayList <Note> = arrayListOf()
        val cursor: Cursor? =
            database?.query(NoteDataBase.DATABASE_NAME, null, null, null, null, null, null
            )
        cursor?.count?.let {
            if (it > 0) {
                while (!cursor.isAfterLast) {
                    var title = ""
                    var description = ""
                    var id = 1
                    val titleIndex = cursor.getColumnIndex(NoteDataBase.COLUMN_NAME_TITLE)

                    if (titleIndex >= 0) {
                        title =
                            cursor.getString(titleIndex)
                    }

                    val descriptionIndex =
                        cursor.getColumnIndex(NoteDataBase.COLUMN_NAME_DESCRIPTION)

                    if (descriptionIndex >= 0) {
                        description =
                            cursor.getString(descriptionIndex)
                    }

                    val idIndex = cursor.getColumnIndex(_ID)
                    if (idIndex >= 0) {
                        id = cursor.getInt(idIndex)
                    }

                    val note = Note(title, description, id)
                    notes.add(note)

                    cursor.moveToNext()
                }
            }
            cursor.close()
        }

        return notes
    }

}