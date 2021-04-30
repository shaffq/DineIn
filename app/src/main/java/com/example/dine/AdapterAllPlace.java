package com.example.dine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterAllPlace extends RecyclerView.Adapter<AdapterAllPlace.ViewHolder> {

    List<DataPlace> placeList;
    Context context;
    private RecyclerViewClickListener listener;

    public AdapterAllPlace(List<DataPlace> placeList, Context context, RecyclerViewClickListener listener) {
        this.placeList = placeList;
        this.context = context;
        this.listener = listener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_all,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.placename.setText(placeList.get(i).getPlaceName());
        viewHolder.location.setText(placeList.get(i).getLocation());
        viewHolder.image.setImageResource(placeList.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public interface RecyclerViewClickListener {
        void onClick(View v, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView placename,location;
        public ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
             placename = itemView.findViewById(R.id.title);
             location = itemView.findViewById(R.id.place);
             this.image = (ImageView) itemView.findViewById(R.id.img);
             itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(itemView, getAdapterPosition());
        }
    }
}
