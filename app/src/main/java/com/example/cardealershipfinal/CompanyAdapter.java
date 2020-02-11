package com.example.cardealershipfinal;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    private Context mCtx;
    private ArrayList<CompanyModel> companies;



    public CompanyAdapter(Context mCtx, ArrayList<CompanyModel> companies) {
        this.mCtx = mCtx;
        this.companies = companies;

    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View e= LayoutInflater.from(parent.getContext()).inflate(R.layout.companies,parent,false);
        CompanyViewHolder evh=new CompanyViewHolder(e);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder holder, final int position) {
        final CompanyModel post = companies.get(position);
        holder.imageView.setImageResource(post.getCompanyLogo());
        holder.TextView.setText(post.getCompanyName());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DetailsActivity.class);
                intent.putExtra("image_url",companies.get(position).getCompanyLogo());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return companies.size();
    }

    public class CompanyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView TextView;
        private Context mContext;
        private CompanyModel currentpost;


        public CompanyViewHolder(View itemView) {
            super(itemView);

            imageView =(ImageView)itemView.findViewById(R.id.companyLogo);
            TextView = (TextView) itemView.findViewById(R.id.companyName);
            /***itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),DetailsActivity.class);
            intent.putExtra("iddraw",);
            v.getContext().startActivity(intent);
            }
            });
             imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(v.getContext(),DetailsActivity.class);
            ImageView iv = (ImageView) v;
            int id =iv.getId();
            /****if(id==R.drawable.mercedes){

            }
            else if(id==R.drawable.bmw){

            }
            intent.putExtra("iddraw",id);
            v.getContext().startActivity(intent);
            }
            });*************************/
        }


        /**public void bindTo(CompanyModel post) {

         TextView.setText(post.getCompanyName());
         currentpost=post;
         imageView.setImageDrawable(mCtx.getResources().getDrawable(currentpost.getCompanyLogo()));

         }**/
    }
}

