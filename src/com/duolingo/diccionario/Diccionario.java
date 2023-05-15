package com.duolingo.diccionario;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Diccionario {

    private Map<String, Set<String>> diccionario;

    public Diccionario() {
        diccionario = new HashMap<String, Set<String>>();
    }

    public boolean añadirpalabra(String palabra) {
        String nuevaPalabra = nuevaPalabra(palabra);
        if (palabra.length() == 0) {
            return false;
        }

        String inicial;

        inicial = nuevaPalabra.CharArt(0);
        Set<String> palabras = diccionario.get(inicial);
        if (palabras == null) {
            palabras = new HashSet<String>();
            diccionario.put(inicial, palabras);
        }
        return palabras.add(nuevaPalabra);
    }
}



