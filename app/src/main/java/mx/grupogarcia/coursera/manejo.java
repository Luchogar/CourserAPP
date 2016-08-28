package mx.grupogarcia.coursera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Luis García on 27/08/2016.
 */
public class manejo extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton= (Button)findViewById(R.id.siguiente);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre       = ((EditText)findViewById(R.id.name)).getText().toString();
                String telefono     = ((EditText)findViewById(R.id.telefono)).getText().toString();
                String email        = ((EditText)findViewById(R.id.correo)).getText().toString();
                String descripcion  = ((EditText)findViewById(R.id.description)).getText().toString();

                Intent nueva = new Intent(manejo.this,datos.class);

                startActivity(nueva);






            }
        });
    }
}
