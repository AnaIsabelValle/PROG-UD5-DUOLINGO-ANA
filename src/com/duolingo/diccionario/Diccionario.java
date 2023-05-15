package com.duolingo.diccionario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Diccionario {

    Map<String, Set<String>> diccionario;

    public Diccionario() {
        diccionario = new HashMap<String, Set<String>>();
    }
}
