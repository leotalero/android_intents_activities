package com.unir.leonardotalero.splash1;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class PrimeraActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primera_actividad);

      //  getActionBar().setDisplayHomeAsUpEnabled(true);

        FloatingActionButton next1 = (FloatingActionButton) findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                botonsegundaActividadClick(view);
            }
        });

        FloatingActionButton back = (FloatingActionButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                menuPrincipal(view);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);

    }

    public void botonsegundaActividadClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), SegundaActividad.class);
        startActivity(intent);
    }
    public void menuPrincipal(View v)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
