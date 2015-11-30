package com.unir.leonardotalero.splash1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;


public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

      //  getActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton back1 = (FloatingActionButton) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                botonprimeraActividadClick(view);
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

    public void botonprimeraActividadClick(View v)
    {
        Intent intent = new Intent(getApplicationContext(), PrimeraActividad.class);
        startActivity(intent);
    }
}
