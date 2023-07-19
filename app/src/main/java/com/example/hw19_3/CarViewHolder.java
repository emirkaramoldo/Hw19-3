package com.example.hw19_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvCar;

    public CarViewHolder(@NonNull View itemView){
        super(itemView);
        tvCar = itemView.findViewById(R.id.tv_car);
    }
    public void bind(String car){
        tvCar.setText(car);
    }
}
