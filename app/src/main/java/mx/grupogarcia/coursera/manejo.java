package mx.grupogarcia.coursera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by Luis García on 27/08/2016.
 */
public class manejo extends ActionBarActivity {

    private String nombre;
    private String telefono;
    private String email;
    private String descrpcion;
    private DatePicker Fech;

    private personal persona;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Button boton= (Button)findViewById(R.id.siguiente);
       // boton.setOnClickListener(new View.OnClickListener() {
            @Override
           // public void onClick(View view) {

                    Button next;

        nombre          = (TextInputEditText) findViewById(R.id.name);
        Fech            = (DatePicker) findViewById(R.id.Fech);
        telefono        = (TextInputEditText) findViewById(R.id.telefono);
        email           = (TextInputEditText) findViewById(R.id.correo);
        descrpcion      = (TextInputEditText) findViewById(R.id.description);
        next            = (Button) findViewById(R.id.siguiente);


        persona = new personal();

        Bundle bundle = getIntent().getExtras();


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(manejo.this, datos.class);
                LeerDatos();
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



            //}
        });
    }
    private void LeerDatos(){
        persona.setNombreCompleto(textnombre.getText().toString());
        persona.setTelefono(texttelefono.getText().toString());
        persona.setCorreo(textemail.getText().toString());
        persona.setDescripcion(textdescrip.getText().toString());
        persona.setDia(Fech.getDayOfMonth());
        persona.setMes(Fech.getMonth());
        persona.setAño(Fech.getYear());
    }
}
