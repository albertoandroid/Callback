package com.example.alten.callback;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    Callback. Un callback es cualquier código ejecutable que se pasa a otra función como argumento, que luego invoca dentro
    de la función externa para completar algún tipo de rutina o acción.
    Ejemplo:
    Retrofit -> Ejemplo de Callback
    Normalmente los Callback nos permiten hacer algo con el resultado del metodo al que le fue pasado. Son muy
    util cuando hacemos operaciones Asincronas como es el caso de Retrofit, debido a que cuando termina de ejecutarse
    podemos obtenerr el resultado a través del Callback
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebServiceMock webServiceMock = new WebServiceMock();
        webServiceMock.login("Alberto", "12345", new CallBack() {
            @Override
            public void onSuccess(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(String response) {
                Toast.makeText(getApplicationContext(), response, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
