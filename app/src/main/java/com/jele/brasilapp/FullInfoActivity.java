package com.jele.brasilapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jele.brasilapp.model.TabsNames;


public class FullInfoActivity extends ActionBarActivity {

    public TabsNames tabsNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        tabsNames = new TabsNames();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_info);

        Bundle bundle = this.getIntent().getExtras();
        String title = bundle.getString("title");
        int imageId = bundle.getInt("imageID");


        Toolbar toolbar = (Toolbar) findViewById(R.id.my_awesome_toolbar_from_new_activity);

        setSupportActionBar(toolbar);

        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        if (title.contentEquals("Informacion General") || title.contentEquals("Recomendaciones Generales") || title.contentEquals("Clima") || title.contentEquals("Tramites")){
            getSupportActionBar().setTitle(tabsNames.tabsNames[0]);
        } else if (title.contentEquals("Lugares de Interes") || title.contentEquals("Transporte") || title.contentEquals("Emergencias")) {
            getSupportActionBar().setTitle(tabsNames.tabsNames[1]);
        }else if (title.contentEquals("Modelo de Comunicacion") || title.contentEquals("Protocolo de Negocios") || title.contentEquals("Recomendaciones de Negocios") || title.contentEquals("Codigo de Vestimenta")) {
            getSupportActionBar().setTitle(tabsNames.tabsNames[2]);
        }

        ImageView imageView = (ImageView) findViewById(R.id.full_info_image_view);
        imageView.setImageDrawable(getDrawable(imageId));

        TextView textViewTitle = (TextView) findViewById(R.id.full_info_title);
        textViewTitle.setText(title);

        TextView textViewBody = (TextView) findViewById(R.id.full_info_body);

        if (title.contentEquals("Informacion General")) {
            textViewBody.setText(getResources().getText(R.string.informacion_general_body));
        } else if (title.contentEquals("Recomendaciones Generales")) {
            textViewBody.setText(getResources().getText(R.string.recomendaciones_generales_body));
        } else if (title.contentEquals("Clima")) {
            textViewBody.setText(getResources().getText(R.string.clima_body));
        } else if (title.contentEquals("Tramites")) {
            textViewBody.setText(getResources().getText(R.string.tramites_body));
        } else if (title.contentEquals("Lugares de Interes")) {
            textViewBody.setText(getResources().getText(R.string.lugares_de_interes_body));
        } else if (title.contentEquals("Emergencias")) {
            textViewBody.setText(getResources().getText(R.string.emergencias_body));
        } else if (title.contentEquals("Transporte")) {
            textViewBody.setText(getResources().getText(R.string.transporte_body));
        } else if (title.contentEquals("Modelo de Comunicacion")) {
            textViewBody.setText(getResources().getText(R.string.modelo_de_comunicacion_body));
        } else if (title.contentEquals("Protocolo de Negocios")) {
            textViewBody.setText(getResources().getText(R.string.protocolo_de_negocios_body));
        } else if (title.contentEquals("Recomendaciones de Negocios")) {
            textViewBody.setText(getResources().getText(R.string.recomendaciones_de_negocios_body));
        } else if (title.contentEquals("Codigo de Vestimenta")) {
            textViewBody.setText(getResources().getText(R.string.codigo_de_vestimenta_body));
        }


        }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shalala, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/


    }

