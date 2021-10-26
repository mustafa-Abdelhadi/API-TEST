package com.apitest.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apitest.model.PostModel;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>
{

    ArrayList<PostModel> postModels;

    public PostAdapter(ArrayList<PostModel> postModels)
    {
        this.postModels = postModels;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position)
    {
    }

    @Override
    public int getItemCount()
    {
        return postModels.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder
    {

        public PostViewHolder(@NonNull View itemView)
        {
            super(itemView);
        }
    }
}
