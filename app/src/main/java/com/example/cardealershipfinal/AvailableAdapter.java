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

public class AvailableAdapter extends RecyclerView.Adapter<AvailableAdapter.AvailableViewHolder> {

    private ArrayList<AvailableModel> mModels;

    public AvailableAdapter(ArrayList<AvailableModel> mModels) {
        this.mModels = mModels;
    }

    @NonNull
    @Override
    public AvailableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View e= LayoutInflater.from(parent.getContext()).inflate(R.layout.available_models,parent,false);
        AvailableViewHolder evh=new AvailableViewHolder(e);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull AvailableViewHolder holder, final int position) {
        AvailableModel currentModel = mModels.get(position);

        holder.mCarImage.setImageResource(currentModel.getCarImage());
        holder.mCarName.setText(currentModel.getCarName());
        holder.mCarEngine.setText(currentModel.getCarEngine());
        holder.mCarOptions.setText(currentModel.getCarOptions());
        holder.mCarImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),Zoomed.class);
                intent.putExtra("image_url",mModels.get(position).getCarImage());
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mModels.size();
    }

    public static class AvailableViewHolder extends RecyclerView.ViewHolder{
        public ImageView mCarImage;
        public TextView mCarName,mCarEngine,mCarOptions;

        public AvailableViewHolder(@NonNull final View itemView) {
            super(itemView);
            mCarImage=itemView.findViewById(R.id.availableModelImage);
            mCarName=itemView.findViewById(R.id.carName);
            mCarEngine=itemView.findViewById(R.id.carEngine);
            mCarOptions=itemView.findViewById(R.id.carOptions);
            /*********itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(),Zoomed.class);
                    intent.putExtra("image_url",);
                    v.getContext().startActivity(intent);
                }
            });***************/
        }
    }
}
