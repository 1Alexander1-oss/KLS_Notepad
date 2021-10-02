package com.ephemerayne.kls_notepad.database

import android.provider.BaseColumns

object NoteDataBase: BaseColumns{
    const val NOTE_NAME = "my_note"
    const val COLUMN_NAME_TITLE = "title"
    const val COLUMN_NAME_DESCRIPTION = "description"


    const val DATABASE_VERSION = 1
    const val DATABASE_NAME =
        "Note.model"

    const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ${NOTE_NAME}_NAME (" +

            "${BaseColumns._ID} INTEGER PRIMARY KEY, " +
            "$COLUMN_NAME_TITLE TEXT, " +
            "$COLUMN_NAME_DESCRIPTION TEXT" +
            ")"
    const val SQL_DELETE_TABLE = "DROP TABLE IF EXISTS ${NOTE_NAME}_NAME"
}
