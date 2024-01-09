package com.example.coloringbook.VIewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coloringbook.R;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.Image_outline);
    }

}
