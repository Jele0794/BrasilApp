package com.jele.brasilapp.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class InfoManager {

    private static String[] infoArray = {"Antes de Partir", "Informacion General", "Protocolo de Negocios", "Recomendaciones de Negocios", "Emergencias"};
    private static String[] infoDescArray = {"Antes de viajar, le recomendamos tomar ciertas consideraciones.", "Datos generales sobre el país.", "Acá encontrará información sobre como comunicarce con su socio, donde llevar a cabo su reunión de negocios y más.", "Tips para lograr mejores relaciones y demás con sus socios.","¿Tiene algún tipo de emergencia?"};
    static int i = -1;
    // , "Emergencias"};


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
