package com.example.test0508;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class stuDataact extends RecyclerView.Adapter<stuDataact.ViewHolder> {

    private static TextView tvname;
    private static TextView tvheight;
    private List<stuData> listData;
    private static ImageView imageView;

    public  stuDataact (List<stuData> listData){
        this.listData = listData;
    }

    public static void add(stuData stuData) {

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tvpic);
            tvname = itemView.findViewById(R.id.tvname);
            tvheight = itemView.findViewById(R.id.tvheight);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View  view = View.inflate(context, R.layout.activity_my_data_view, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        stuData stuData = listData.get(position);
//        imageView.setImageResource(stuData.getId());
        Glide.with(holder.itemView).load(stuData.getImageURL()).into(imageView);

        tvname.setText(stuData.getName());
        tvheight.setText(stuData.getHeight());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }
}
