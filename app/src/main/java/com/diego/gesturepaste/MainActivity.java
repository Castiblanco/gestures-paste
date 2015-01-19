package com.diego.gesturepaste;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button boton1, boton2, boton3;
    EditText texto1, texto2, texto3;
    String textoACopiar;
    ClipData aCopiar;
    ClipboardManager portapapeles;
    Context context;
    CharSequence text;
    int duracion;
    Toast aviso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);

        texto1 = (EditText) findViewById(R.id.text1);
        texto2 = (EditText) findViewById(R.id.text2);
        texto3 = (EditText) findViewById(R.id.text3);

        portapapeles = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);

        context = getApplicationContext();
        text = "¡El texto fue copiado!";
        duracion = Toast.LENGTH_SHORT;

        aviso = Toast.makeText(context, text, duracion);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // create class object
                textoACopiar = texto1.getText().toString();
                aCopiar = ClipData.newPlainText("text", textoACopiar);
                portapapeles.setPrimaryClip(aCopiar);
                aviso.show();
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // create class object
                textoACopiar = texto2.getText().toString();
                aCopiar = ClipData.newPlainText("text", textoACopiar);
                portapapeles.setPrimaryClip(aCopiar);
                aviso.show();
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // create class object
                textoACopiar = texto3.getText().toString();
                aCopiar = ClipData.newPlainText("text", textoACopiar);
                portapapeles.setPrimaryClip(aCopiar);
                aviso.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    }






}
