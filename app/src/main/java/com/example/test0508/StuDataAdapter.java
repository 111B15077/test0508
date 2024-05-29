package com.example.test0508;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

class StuDataAdapter extends RecyclerView.Adapter<StuDataAdapter.ViewHolder> {

    private ImageView img;
    private TextView tvName1;
    private TextView tvHeight1;

    private OnItemClickListener listener;

    public List<StuData> getStuDataList() {
        return stuDataList;
    }

    private List<StuData> stuDataList;

    public StuDataAdapter(List<StuData> stuDataList) {
        this.stuDataList = stuDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = View.inflate(context, R.layout.activity_my_data_view, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        StuData stuData = stuDataList.get(position);
//        img.setImageResource(stuData.getId());
        Glide.with(holder.itemView).load(stuData.getImageUrl()).into(img);
        tvHeight1.setText(stuData.getHeight());
        tvName1.setText(stuData.getName());

    }

    @Override
    public int getItemCount() {
        return stuDataList.size();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.listener = onItemClickListener;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.tvPic);
            tvName1 = itemView.findViewById(R.id.tvname);
            tvHeight1 = itemView.findViewById(R.id.tvHeight);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAbsoluteAdapterPosition();
                    if (listener != null) {
                        listener.onItemClick(position);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);

    }
}