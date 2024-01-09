package com.example.coloringbook.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.coloringbook.VIewHolder.ImageViewHolder;
import com.example.coloringbook.R;

import java.util.ArrayList;
import java.util.List;

//public class ImageAdapter extends RecyclerView.Adapter<ImageViewHolder> {
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private List<Integer> listImages;
    public int[] imageArray = {
            R.drawable.fox, R.drawable.volf, R.drawable.homa
    };

    public ImageAdapter(Context mContext){
        this.mContext=mContext;
       //this.listImages=getImages();
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));

        return imageView;
    }

    /*private List<Integer> getImages() {
        List<Integer> results=new ArrayList<>();

        results.add(R.drawable.volf);
        results.add(R.drawable.fox);
        results.add(R.drawable.homa);

        return results;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.item_images,parent,false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(listImages.get(position));
    }

    @Override
    public int getItemCount() {
        return listImages.size();
    }*/
}
