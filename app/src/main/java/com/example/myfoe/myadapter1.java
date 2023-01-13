package com.example.myfoe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter1 extends RecyclerView.Adapter<myadapter1.myviewholder>
{
    ArrayList<NewsModel> datalist1;

    public myadapter1(ArrayList<NewsModel> datalist1) {
        this.datalist1 = datalist1;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow1, parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.t1.setText(datalist1.get(position).getTitle());
        holder.t2.setText(datalist1.get(position).getIntro());
        holder.t3.setText(datalist1.get(position).getDate());
        holder.t4.setText(datalist1.get(position).getTime());
        holder.t5.setText(datalist1.get(position).getVenue());
    }

    @Override
    public int getItemCount() {
        return datalist1.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView t1, t2, t3, t4, t5;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            t1 = itemView.findViewById(R.id.t1);
            t2 = itemView.findViewById(R.id.t2);
            t3 = itemView.findViewById(R.id.t3);
            t4 = itemView.findViewById(R.id.t4);
            t5 = itemView.findViewById(R.id.t5);
        }
    }
}
