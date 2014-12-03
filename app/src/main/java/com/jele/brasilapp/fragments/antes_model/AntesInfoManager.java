package com.jele.brasilapp.fragments.antes_model;

import com.jele.brasilapp.model.Info;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class AntesInfoManager {

    private static String[] infoArray = {"Informacion General", "Recomendaciones Generales", "Clima", "Tramites"};
    private static String[] infoDescArray = {"Datos generales sobre el país.", "Objetos importantes que llevar, lugares para visitar y comer en su viaje.", "", "¿Tiene los papeles y permisos para viajar?"};
    static int i = -1;


    private static AntesInfoManager mInstance;
    private List<Info> tiposDeInfo;

    public static AntesInfoManager getInstance() {
        if (mInstance == null) {
            mInstance = new AntesInfoManager();
        }

        return mInstance;
    }

    public List<Info> getInformationCards() {
        if (tiposDeInfo == null) {
            tiposDeInfo = new ArrayList<Info>();

            for (String infoName : infoArray) {
                i++;
                Info informacion = new Info();
                informacion.title = infoName;
                informacion.description = infoDescArray[i];
                informacion.imageName = infoName.replaceAll("\\s+", "").toLowerCase();
                tiposDeInfo.add(informacion);
            }
        }

        return tiposDeInfo;
    }

}
