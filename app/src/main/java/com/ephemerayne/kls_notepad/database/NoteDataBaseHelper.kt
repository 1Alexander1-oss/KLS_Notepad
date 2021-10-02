package com.ephemerayne.kls_notepad.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class NoteDataBaseHelper(context: Context) : SQLiteOpenHelper(
    context, NoteDataBase.DATABASE_NAME,
    null, NoteDataBase.DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(NoteDataBase.CREATE_TABLE)

    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db?.execSQL(NoteDataBase.SQL_DELETE_TABLE)
        onCreate(db)
    }
}