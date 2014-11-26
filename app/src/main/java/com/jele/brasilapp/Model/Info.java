package com.jele.brasilapp.Model;

import android.content.Context;

/**
 * Created by Edmundo on 11/25/14.
 */
public class Info {

    public String title;
    public String description;
    public String imageName;

    public int getImageResourceId(Context context) {
        try {
            return context.getResources().getIdentifier(this.imageName, "drawable", context.getPackageName());

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
