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
        return palabras.add(nuevaPalabra
        );
    }

    public boolean eliminarPalabra(String palabra) {
        String eliminandoPalabra = eliminandoPalabra(palabra);
        if (eliminandoPalabra.length() == 0) {
            return false;
        }
        String inicial = eliminandoPalabra.CharArt(0);
        Set<String> palabras = diccionario.get(inicial);
        if (palabras == null) {
            return false;
        }
        return palabras.remove(eliminandoPalabra);
    }

    public boolean tenerPalabra(String palabra) {
        String existePalabra = existePalabra(palabra);
        if (existePalabra.length() == 0) {
            return false;
        }
        String inicial = existePalabra.CharArt(0);
        Set<String> palabras = diccionario.get(existePalabra);
        if (palabras == null) {
            return false;
        }
        return palabras.contains(existePalabra);
    }


}



