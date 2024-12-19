/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author grier
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc = 0;
        ArrayList<Integer> pila = new ArrayList<Integer>();
        do {
            opc = menu(pila);
            switch (opc) {
                case 1:
                    apilar(pila);
                    break;
                case 2:
                    desapilar(pila);
                    break;
                case 3:
                    mostrarPrimero(pila);
                    break;
                case 4:
                    mostrarUltimo(pila);
                    break;
                default:
                    System.out.println("Hasta otra!");
            }
        } while (opc != 0);
    }

    public static void apilar(ArrayList<Integer> pila) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un numero: ");
        int numeroUsu = sc.nextInt();
        int tamano = 10;
        pila.add(numeroUsu);
    }

    public static void desapilar(ArrayList<Integer> pila) {
        pila.removeLast();
    }

    public static int mostrarPrimero(ArrayList<Integer> pila) {
        int num = pila.get(0);
        System.out.println("Su ultimo numero introducido fue: " + num);
        return num;
    }

    public static int mostrarUltimo(ArrayList<Integer> pila) {
        int num = pila.get(pila.size() - 1);
        System.out.println("El primer numero introducido fue: " + num);
        return num;
    }

    public static int menu(ArrayList<Integer> pila) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        if (pila.size() != 10) {
            System.out.println("[1] Apilar");
        } else {
            System.out.println("[1] No se puede apilar");
        }
        if (pila.size() == 0) {
            System.out.println("[2] No se puede desapilar");
            System.out.println("[3] No se puede mostrar el primer numero agregado");
            System.out.println("[4] No se puede mostrar el ultimo numero agregado");
        } else {
            System.out.println("[2] Quitar numero");
            System.out.println("[3] Mostrar primer numero introducido");
            System.out.println("[4] Mostrar ultimo numero introducido");
        }
        System.out.println("[0] Para salir");
        System.out.print("Su opcion: ");

        while (true) {
            opcion = sc.nextInt();
            if (pila.size() != 10 && opcion == 1) {
                return opcion;
            } 
            if (pila.size() != 0 && (opcion == 2 || opcion == 3 || opcion == 4)){
                return opcion;
            }
            if (opcion == 0){
                return 0;
            }
        }
    }

// ArrayList<Integer> pila = new ArrayList<>();
// pila.add() (poner dentro el numero que quiera con sc.nextInt());
// pila.remove() (poner dentro indice, posicion o tambien especificar el valor (Integer.valueOf("2"));
// pila.size() (enseña el tamaño de la pila );
// pila.get() (poner dentro la posicion del numero, 0 = 1);    }
}
