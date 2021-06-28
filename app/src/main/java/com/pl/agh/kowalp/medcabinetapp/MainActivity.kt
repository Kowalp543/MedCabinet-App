package com.pl.agh.kowalp.medcabinetapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pl.agh.kowalp.medcabinetapp.*

class MainActivity : AppCompatActivity() {


    lateinit var CheckButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        CheckButton = findViewById(R.id.checkbutton)

        CheckButton.setOnClickListener {
            val intent = Intent(this, MedicineList::class.java)
            startActivity(intent)
        }
    }

}