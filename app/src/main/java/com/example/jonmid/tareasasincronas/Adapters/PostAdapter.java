package com.example.jonmid.tareasasincronas.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.tareasasincronas.Models.Post;
import com.example.jonmid.tareasasincronas.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yojan on 28/04/2018.
 */


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {

    List<Post> postsList = new ArrayList<>();
    Context context;

    public PostAdapter(List<Post> countryList, Context context) {
        this.postsList = postsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Obtener la vista (item.xml)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempost, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.TVid.setText(String.valueOf(postsList.get(position).getId()));
        holder.TVtitle.setText(postsList.get(position).getTitle());
        holder.TVbody.setText(postsList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView TVid;
        TextView TVtitle;
        TextView TVbody;

        public ViewHolder(View item) {
            super(item);

            TVid = (TextView) item.findViewById(R.id.textID);
            TVtitle = (TextView) item.findViewById(R.id.textTitle);
            TVbody = (TextView) item.findViewById(R.id.textBody);
        }
    }
}
