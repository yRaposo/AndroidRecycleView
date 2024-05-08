package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EstufaActivity : Activity(){

    var nomes = arrayListOf("Dendro 01", "Dendro 02", "Dendro 03")

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle);

        setContentView(R.layout.main_activity);

        val rcvEstufa = findViewById<RecyclerView>(R.id.rcv_estufa)
        rcvEstufa.layoutManager = LinearLayoutManager(this)
        val adapter = RecicleViewAdapterEstufa(this, nomes)
        rcvEstufa.adapter = adapter
    }
}