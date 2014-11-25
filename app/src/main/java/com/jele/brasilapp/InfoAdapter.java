package com.jele.brasilapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jele.brasilapp.Model.Info;

import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder>{
    private List<Info> tipoDeInfo;
    private int rowLayout;
    private Context mContext;

    public InfoAdapter(List<Info> tipoDeInfo, int rowLayout, Context context) {
        this.tipoDeInfo = tipoDeInfo;
        this.rowLayout = rowLayout;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(rowLayout, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Info info = tipoDeInfo.get(i);
        viewHolder.infoTitle.setText(info.title);
        viewHolder.infoDescrip.setText(info.description);
        viewHolder.infoImage.setImageDrawable(mContext.getDrawable(info.getImageResourceId(mContext)));
    }

    @Override
    public int getItemCount() {
        return tipoDeInfo == null ? 0 : tipoDeInfo.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView infoTitle, infoDescrip;
        public ImageView infoImage;


        public ViewHolder(View itemView) {
            super(itemView);
            infoTitle = (TextView) itemView.findViewById(R.id.title);
            infoImage = (ImageView)itemView.findViewById(R.id.photo);
            infoDescrip = (TextView) itemView.findViewById(R.id.descripcion);
        }

    }
}
