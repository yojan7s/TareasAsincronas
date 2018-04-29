package com.example.jonmid.tareasasincronas.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jonmid on 12/04/18.
 */

public class HttpManager {

    public static String getDataJson(String url) throws IOException {

        // Clase para manejar archivos
        BufferedReader bufferedReader;

        // Clase para manejar las urls de internet
        URL urlData = new URL(url);

        // Clase para hacer la conexion a internet
        HttpURLConnection httpURLConnection = (HttpURLConnection) urlData.openConnection();

        // Declarar objeto de tipo StringBuilder para manejar el tipo de archivo
        StringBuilder stringBuilder = new StringBuilder();

        // Leer los datos de internet
        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

        String line;
        while ( (line = bufferedReader.readLine()) != null ){
            stringBuilder.append(line + "\n");
        }

        return stringBuilder.toString();
    }

}
