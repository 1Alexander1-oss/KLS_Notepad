package com.ephemerayne.kls_notepad.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class NoteDataBaseHelper(context: Context) : SQLiteOpenHelper(
    context, NoteDataBase.DATABASE_NAME,
    null, NoteDataBase.DATABASE_VERSION
) {
    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}