package com.example.teaapp.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teaapp.R;
import com.example.teaapp.model.Tea;

import java.util.List;

public class AdapterTea extends RecyclerView.Adapter<AdapterTea.TeaHolder> {

    public Activity activity;
    public List<Tea> data;
    public int item_layout;

    public AdapterTea(Activity activity, List<Tea> data, int item_layout) {
        this.activity = activity;
        this.data = data;
        this.item_layout = item_layout;
    }

    @NonNull
    @Override
    public TeaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(item_layout,parent,false);
        return new TeaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeaHolder holder, int position) {
        Tea tea = data.get(position);
        holder.item_title.setText(tea.name);
        holder.item_img.setImageResource(tea.photo);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class TeaHolder extends RecyclerView.ViewHolder{

        public ImageView item_img;
        public TextView item_title;

        public TeaHolder(@NonNull View itemView) {
            super(itemView);
            item_img = itemView.findViewById(R.id.item_img);
            item_title = itemView.findViewById(R.id.item_title);
        }
    }


}
