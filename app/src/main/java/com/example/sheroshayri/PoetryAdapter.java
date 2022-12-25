package com.example.sheroshayri;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PoetryAdapter {


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView PoetName,Data , date ;
        Button Delete,Update;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            PoetName = itemView.findViewById(R.id.poetName);
            Data = itemView.findViewById(R.id.data);
            date = itemView.findViewById(R.id.date);
            Delete = itemView.findViewById(R.id.delete);
            Update = itemView.findViewById(R.id.update);
        }
    }
}
