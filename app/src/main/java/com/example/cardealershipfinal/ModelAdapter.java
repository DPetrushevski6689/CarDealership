package com.example.cardealershipfinal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ElementViewHolder>{
    private ArrayList<Model> mModel;
    public static class ElementViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView mTextView;
        public ElementViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.modelImage);
            mTextView=itemView.findViewById(R.id.modelName);
        }
    }

    public ModelAdapter(ArrayList<Model> komentari){
        mModel =komentari ;
    }

    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View e= LayoutInflater.from(parent.getContext()).inflate(R.layout.models,parent,false);
        ElementViewHolder evh=new ElementViewHolder(e);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ElementViewHolder holder, final int position) {
        Model currentItem = mModel.get(position);

        holder.mImageView.setImageResource(currentItem.getModelImage());
        holder.mTextView.setText(currentItem.getModelName());

        holder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),AvailableActivity.class);
                intent.putExtra("image_url1",mModel.get(position).getModelImage());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mModel.size();
    }
}
