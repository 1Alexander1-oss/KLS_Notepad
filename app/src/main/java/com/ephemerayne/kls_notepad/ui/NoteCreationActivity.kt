package com.ephemerayne.kls_notepad.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ephemerayne.kls_notepad.R

class NoteCreationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_creation)
    }

} // обьявить все View в onCreate (EditText, Button), создать click на кнопку,(сохранение полей по клику в DB)