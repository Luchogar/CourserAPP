package mx.grupogarcia.coursera;

/**
 * Created by Luis García on 27/08/2016.
 */

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class datos extends ActionBarActivity {
    personal persona;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle bundle = getIntent().getExtras();

        TextView tvNombreCompleto = (TextView) findViewById(R.id.muestra1);
        TextView tvTelefono = (TextView) findViewById(R.id.muestra2);
        TextView tvCorreo = (TextView) findViewById(R.id.muestra3);
        TextView tvDescripcion = (TextView) findViewById(R.id.muestra4);
        TextView tvFechaNacimiento = (TextView) findViewById(R.id.muestra5);

        Button btnEditarDatos = (Button) findViewById(R.id.edit);
        persona = new personal();

        persona.setNombreCompleto(bundle.getString(getResources().getString(R.string.nombre)));
        persona.setTelefono(bundle.getString(getResources().getString(R.string.telefono)));
        persona.setCorreo(bundle.getString(getResources().getString(R.string.email)));
        persona.setDescripcion(bundle.getString(getResources().getString(R.string.descrip)));
        persona.setDia(bundle.getInt(getResources().getString(R.string.DIA)));
        persona.setMes(bundle.getInt(getResources().getString(R.string.MES)));
        persona.setAño(bundle.getInt(getResources().getString(R.string.AÑO)));

        tvNombreCompleto.setText(persona.getNombreCompleto());
        tvFechaNacimiento.setText(persona.getFechaNacimiento());
        tvTelefono.setText(persona.getTelefono());
        tvCorreo.setText(persona.getCorreo());
        tvDescripcion.setText(persona.getDescripcion());

        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(datos.this, manejo.class);
                intent.putExtra(getResources().getString(R.string.nombre), persona.getNombreCompleto());
                intent.putExtra(getResources().getString(R.string.telefono), persona.getTelefono());
                intent.putExtra(getResources().getString(R.string.email), persona.getCorreo());
                intent.putExtra(getResources().getString(R.string.descrip), persona.getDescripcion());
                intent.putExtra(getResources().getString(R.string.DIA), persona.getDia());
                intent.putExtra(getResources().getString(R.string.MES), persona.getMes());
                intent.putExtra(getResources().getString(R.string.AÑO), persona.getAño());
                startActivity(intent);
                finish();
            }
        });


    }
}