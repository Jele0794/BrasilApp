package com.jele.brasilapp.fragments.dentro_model;

import com.jele.brasilapp.model.Info;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class DentroInfoManager {

    private static String[] infoArray = {"Lugares de Interes", "Transporte", "Emergencias"};
    private static String[] infoDescArray = {"Sabemos que no todo son negocios, por lo que acá encontrará algunos lugares que visitar.", "¿No quiere rentar un vehículo? Aquí encontrará información de transporte público.", "¿Tiene algúna emergencia?"};
    static int i = -1;


    private static DentroInfoManager mInstance;
    private List<Info> tiposDeInfo;

    public static DentroInfoManager getInstance() {
        if (mInstance == null) {
            mInstance = new DentroInfoManager();
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
