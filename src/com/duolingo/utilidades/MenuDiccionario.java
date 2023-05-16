package com.duolingo.utilidades;

import com.duolingo.diccionario.Diccionario;

import java.util.Scanner;
import java.util.Set;

public class MenuDiccionario {
    private Diccionario diccionario;
    private Scanner scanner;

    public MenuDiccionario() {
        Diccionario diccionario = new Diccionario();
        scanner = new Scanner(System.in);

        System.out.println(" Bienvenido al diccionario de palabras Duolingo-Ana");
        boolean salida = false;
        while (!salida) {
            System.out.println("Querido usuraio, introduzca una opción:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    añadirPalabra();
                    break;
                case 2:
                    eliminarPalabra();
                    break;
                case 3:
                    existirPalabra();
                    break;
                case 4:
                    mostrarIniciales();
                    break;
                case 5:
                    verPalabrasPorInicial();
                    break;
                case 6:
                    salida = true;
                    System.out.println(" Esperamos que le haya gustado y continúe haciendo consultas");
                    break;
                default:
                    System.out.println("Ha seleccionado una opción incorrecta, por favor introduzca una de nuevo.");
                    break;
            }
        }
    }

    private void verPalabrasPorInicial() {
        System.out.println("Introduce la inicial:");
        char inicial = scanner.nextLine().charAt(0);
        Set<String> palabras = diccionario.getPalabrasQueEmpiecen(inicial);
        if (palabras.size() == 0) {
            System.out.println("No hay palabras almacenadas que empiecen por esa inicial.");
        } else {
            System.out.println("Las palabras almacenadas que empiezan por " + inicial + " son:");
            for (String word : palabras) {
                System.out.println(word);
            }
        }
    }

    private void mostrarIniciales() {
        Set<Character> iniciales = diccionario.getIniciales();
        if (iniciales.size() == 0) {
            System.out.println("No hay iniciales disponibles.");
        } else {
            System.out.println("Las iniciales disponibles son:");
            for (Character inicial : iniciales) {
                System.out.println(inicial);
            }
        }
    }

    private void existirPalabra() {
        System.out.println("Introduce la palabra que quieres buscar:");
        String palabra = scanner.nextLine();
        if (diccionario.tenerPalabra(palabra)) {
            System.out.println("La palabra está almacenada.");
        } else {
            System.out.println("La palabra no está almacenada.");
        }
    }

    private void eliminarPalabra() {
        System.out.println("Introduce la palabra que quieres eliminar:");
        String palabra = scanner.nextLine();
        if (diccionario.eliminarPalabra(palabra)) {
            System.out.println("La palabra se ha eliminado correctamente.");
        } else {
            System.out.println("La palabra no estaba almacenada.");
        }
    }

    private void añadirPalabra() {
        System.out.println("Introduce la palabra que quieres añadir:");
        String palabra = scanner.nextLine();
        if (diccionario.añadirPalabra(palabra)) {
            System.out.println("La palabra se ha añadido correctamente.");
        } else {
            System.out.println("La palabra ya estaba almacenada.");
        }
    }

}


