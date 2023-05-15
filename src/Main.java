import com.duolingo.diccionario.Diccionario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args {
        // Crear el diccionario
        Diccionario diccionario = new Diccionario();

        System.out.println("************----ooOOoo----************");
        System.out.println("Bienvenido al diccionario de Duolingo-Ana.");

        // Menú de opciones
        boolean salida = false;
        Scanner scanner = new Scanner(System.in);

        while (!salida) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Buscar palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Querido usuario, introduzca la palabra a añadir:");
                    String palabraParaAñadir = scanner.nextLine();
                    if (diccionario.añadirPalabra(palabraParaAñadir)) {
                        System.out.println("La palabra se ha guardado correctamente.");
                    } else {
                        System.out.println("La palabra ya está almacenada en el diccionario.");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca  la palabra a eliminar:");
                    String palabraParaEliminar = scanner.nextLine();
                    if (diccionario.eliminarPalabra(palabraParaEliminar)) {
                        System.out.println("La palabra se ha eliminado correctamente.");
                    } else {
                        System.out.println("La palabra no estaba almacenada en el diccionario.");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca la palabra a buscar:");
                    String palabraParaBuscar = scanner.nextLine();
                    if (diccionario.containsWord(palabraParaBuscar)) {
                        System.out.println("La palabra se ha encontrado en el diccionario.");
                    } else {
                        System.out.println("La palabra no se ha encontrado en el diccionario.");
                    }
                    break;
                case 4:
                    System.out.println("Iniciales disponibles:");
                    for (char inicial : diccionario.getInicialDisponible()) {
                        System.out.println(inicial);
                    }
                    break;
                case 5:
                    System.out.println("Ingrese una inicial:");
                    char inicial = scanner.nextLine().charAt(0);
                    System.out.println("Palabras que empiezan con '" + inicial + "':");
                    for (String word : diccionario.getPalabraInicial(inicial)) {
                        System.out.println(palabra);
                    }
                    break;
                case 6:
                    salida = true;
                    break;
                default:
                    System.out.println("Ha seleccionada una opción icorrecta, inténtelo  de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}

