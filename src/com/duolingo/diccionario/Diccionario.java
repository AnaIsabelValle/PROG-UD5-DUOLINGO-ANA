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
        String palabras_Sanitanizadas = palabra_Sanitanizada(palabra);
        if (palabras_Sanitanizadas.length() == 0) {
            return false;
        }

        char inicial = palabras_Sanitanizadas.charAt(0);
        Set<String> palabras = diccionario.get(inicial);
        if (palabras == null) {
            palabras = new HashSet<String>();
            diccionario.put(inicial, palabras);
        }
        return palabras.add(palabras_Sanitanizadas);
    }

    public boolean eliminarPalabra(String palabra) {
        String palabras_Sanitanizadas = palabra_Sanitanizada(palabra);
        if (palabras_Sanitanizadas.length() == 0) {
            return false;
        }
        char inicial = palabras_Sanitanizadas.charAt(0);
        Set<String> palabras = diccionario.get(inicial);
        if (palabras == null) {
            return false;
        }
        return palabras.remove(palabras_Sanitanizadas);
    }

    public boolean tenerPalabra(String palabra) {
        String palabras_Sanitanizadas = palabra_Sanitanizada(palabra);
        if (palabras_Sanitanizadas.length() == 0) {
            return false;
        }
        char inicial = palabras_Sanitanizadas.charAt(0);
        Set<String> palabras = diccionario.get(inicial);
        if (palabras == null) {
            return false;
        }
        return palabras.contains(palabras_Sanitanizadas);
    }


}



