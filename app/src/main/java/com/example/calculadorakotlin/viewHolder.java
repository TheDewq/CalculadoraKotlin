package com.example.calculadorakotlin;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    private TextView operacion, resultado;
    public viewHolder(@NonNull View itemView) {
        super(itemView);
        operacion = itemView.findViewById(R.id.Operacion);
        resultado = itemView.findViewById(R.id.Resultado);
    }
    public void bind(listOperaciones operaciones){
        operacion.setText(operaciones.getOperacion());
        resultado.setText(operaciones.getResultado());
    }
}
