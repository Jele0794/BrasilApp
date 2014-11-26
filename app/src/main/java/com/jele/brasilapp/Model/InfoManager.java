package com.jele.brasilapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class InfoManager {

    private static String[] infoArray = {"Antes de Partir", "Protocolo de Negocios", "Informacion General"};
    private static String[] infoDescArray = {"Al realizar el viaje a Brasil, le recomendamos tomar ciertas consideraciones antes de viajar.", "protocolation", "Information"};
    static int i = -1;
    //, "Información General", "Protocolo de Negocios", "Recomendaciones de Negocios", "Emergencias"};


    private static InfoManager mInstance;
    private List<Info> tiposDeInfo;

    public static InfoManager getInstance() {
        if (mInstance == null) {
            mInstance = new InfoManager();
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
