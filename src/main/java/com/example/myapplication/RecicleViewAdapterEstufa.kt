package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecicleViewAdapterEstufa(context: Context, list: ArrayList<String>):
    RecyclerView.Adapter<EstufaViewHolder>() {
        var lista: ArrayList<String>
        var inflater: LayoutInflater;

        init {
            lista = list;
            inflater = LayoutInflater.from(context)
        }

        override fun onCreateViewHolder(
            parent: ViewGroup, viewType: Int) : EstufaViewHolder {
            val view = inflater.inflate(R.layout.estufa_row_layout, parent, false)

            return EstufaViewHolder(view)
        }

    override fun getItemCount(): Int {
        return lista.size;
    }

    override fun onBindViewHolder(holder: EstufaViewHolder, position: Int) {
        val texto = lista[position]
        holder.txtNome.text = texto
    }
}