package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstufaViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    var txtNome: TextView;
    var txtTemperature: TextView;
    var txtLumini: TextView;
    var txtUmid: TextView;

    init {
        txtNome = view.findViewById(R.id.txt_nome)
        txtTemperature = view.findViewById(R.id.txt_temp)
        txtLumini = view.findViewById(R.id.txt_lumini)
        txtUmid = view.findViewById(R.id.txt_umid)
    }
}