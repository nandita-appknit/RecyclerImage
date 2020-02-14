package com.example.recyclerimage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageViewHolder> {
    @NonNull
    private int[] image;
    public RecyclerAdapter(int[] image){
        this.image=image;
    }
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.album,parent,false);
        ImageViewHolder imageViewHolder=new ImageViewHolder(view);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        int image_id=image[position];
        holder.album.setImageResource(image_id);
        holder.albumtitle.setText("Image "+position);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
    ImageView album;
    TextView albumtitle;
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            album=itemView.findViewById(R.id.album);
            albumtitle=itemView.findViewById(R.id.title);
        }
    }


}
