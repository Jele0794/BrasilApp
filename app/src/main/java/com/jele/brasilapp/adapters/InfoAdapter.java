package com.jele.brasilapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jele.brasilapp.FullInfoActivity;
import com.jele.brasilapp.R;
import com.jele.brasilapp.model.Info;

import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {
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
        final Info info = tipoDeInfo.get(i);
        viewHolder.infoTitle.setText(info.title);
        viewHolder.infoDescrip.setText(info.description);
        viewHolder.infoImage.setImageDrawable(mContext.getDrawable(info.getImageResourceId(mContext)));
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, FullInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title", info.title);
                bundle.putInt("imageID", info.getImageResourceId(mContext));
                intent.putExtras(bundle);
                mContext.startActivity(intent);




                //  Toast.makeText(mContext, info.description, Toast.LENGTH_SHORT).show();
            }
        });

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
            infoImage = (ImageView) itemView.findViewById(R.id.photo);
            infoDescrip = (TextView) itemView.findViewById(R.id.descripcion);
        }

    }
}
