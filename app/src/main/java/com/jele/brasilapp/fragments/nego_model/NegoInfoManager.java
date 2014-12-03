package com.jele.brasilapp.fragments.nego_model;

import com.jele.brasilapp.model.Info;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edmundo on 11/25/14.
 */
public class NegoInfoManager {

    private static String[] infoArray = {"Modelo de Comunicacion", "Protocolo de Negocios", "Recomendaciones de Negocios", "Codigo de Vestimenta"};
    private static String[] infoDescArray = {"Aquí describimos cuál es la mejor forma para comunicarte con tus próximos socios.", "¿No sabe cómo se manejan los negocios en esta parte del mundo? Acá lo ayudamos.", "Tips para lograr mejores relaciones y demás con sus socios.", "Cómo vestir para negocios fuera de su país"};
    static int i = -1;


    private static NegoInfoManager mInstance;
    private List<Info> tiposDeInfo;

    public static NegoInfoManager getInstance() {
        if (mInstance == null) {
            mInstance = new NegoInfoManager();
        }

        return mInstance;
    }

    public List<Info> getInformationCards() {
        if (tiposDeInfo == null) {
            tiposDeInfo = new ArrayList<Info>();


          /*  Info informacion = new Info();
            informacion.title = infoArray[0];
            informacion.description = infoDescArray[0];
            informacion.imageName = infoArray[1].replaceAll("\\s+", "").toLowerCase();
            tiposDeInfo.add(informacion);*/

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
