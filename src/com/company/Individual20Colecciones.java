/*
Tarea individual 20 - Colecciones
Alumno: Erick Díaz Guerra
*/
package com.company;
import java.util.Collections; // Contiene el metodo para max y min en las colecciones.
import java.util.Scanner;
import java.util.ArrayList;

public class Individual20Colecciones {
   public static void main(String[] args) {

      Scanner asignar = new Scanner(System.in);

      System.out.println("<<< Ingreso y procesamiento de numeros con una coleccion >>>");

      System.out.println("****************************** ******************************");
      System.out.println("Ingrese numeros enteros uno a uno presionando ENTER.");
      System.out.println("Para finalizar el registro ingrese un cero:");

// Bloque encargado del ingreso y validacion de los numeros.
      String numero;
      ArrayList<Integer> numeros = new ArrayList<Integer>();
      int iNum = 1;
      System.out.println("****************************** ******************************");
      do {
         numero = asignar.nextLine();
         while (!esEntero(numero)) {
            System.out.println("Ingrese un numero entero valido:");
            numero = asignar.nextLine();
         }
         if (Integer.parseInt(numero) != 0) {
            numeros.add(Integer.parseInt(numero));
            iNum++;
         } else {
            if (iNum <= 3)
               System.out.println("Ingrese al menos 3 numeros distintos de cero antes de salir.");
         }
      } while (!(Integer.parseInt(numero) == 0 && iNum > 3));

// Bloque que muestra los numeros ingresados en el mismo orden de registro.
      System.out.println("****************************** ******************************");
      System.out.println("Los numeros ingresados son los siguientes:");
      for (int i = 0; i < numeros.size(); i++) {
         if (i % 20 == 0 && i > 0) System.out.println("");
         System.out.print("["+numeros.get(i)+"] ");
      }
      System.out.println("");

// Bloque que calcula el promedio de los numeros.
      int suma = 0;
      float promedio;
      for (int i = 0; i < numeros.size(); i++) {
         suma = suma + numeros.get(i);
      }
      promedio = (float)suma / (float)numeros.size();
      System.out.println("****************************** ******************************");
      System.out.println("El promedio de ellos es "+promedio);

// Bloque que encuentra el numero menor. Hay dos maneras, con for y con el API.
      int menor = numeros.get(0);
      for (int i = 0; i < numeros.size(); i++) {
         if (numeros.get(i) <= menor) menor = numeros.get(i);
      }
      System.out.println("****************************** ******************************");
      //System.out.println("El numero menor es "+menor);
      System.out.println("El numero menor es "+Collections.min(numeros)); // Desde API Java.

// Bloque que encuentra el numero mayor. Hay dos maneras, con for y con el API.
      int mayor = numeros.get(0);
      for (int i = 0; i < numeros.size(); i++) {
         if (numeros.get(i) >= mayor) mayor = numeros.get(i);
      }
      System.out.println("****************************** ******************************");
      //System.out.println("Y el mayor es "+mayor);
      System.out.println("Y el mayor es "+Collections.max(numeros));

// Bloque que elimina los numeros pares de la serie.
      int index = 0;
      do {
         if (numeros.get(index) % 2 == 0) {
            numeros.remove(index);
         } else index++;
      } while (index < numeros.size());
      System.out.println("****************************** ******************************");
      System.out.println("Los numeros sin considerar los pares son los siguientes:");
      for (int i = 0; i < numeros.size(); i++) {
         if (i % 20 == 0 && i > 0) System.out.println("");
         System.out.print("["+numeros.get(i)+"] ");
      }
      System.out.println("");

// Bloque que calcula el promedio de los numeros sin los pares.
      int suma2 = 0;
      float promedio2;
      for (int i = 0; i < numeros.size(); i++) {
         suma2 = suma2 + numeros.get(i);
      }
      promedio2 = (float)suma2 / (float)numeros.size();
      System.out.println("****************************** ******************************");
      System.out.println("El promedio de ellos es "+promedio2);

// Bloque que encuentra el menor valor sin los pares.
      int menor2 = numeros.get(0);
      for (int i = 0; i < numeros.size(); i++) {
         if (numeros.get(i) <= menor2) menor2 = numeros.get(i);
      }
      System.out.println("****************************** ******************************");
      //System.out.println("El numero menor es "+menor2);
      System.out.println("El numero menor es "+Collections.min(numeros));

// Bloque que encuentra el mayor sin los pares.
      int mayor2 = numeros.get(0);
      for (int i = 0; i < numeros.size(); i++) {
         if (numeros.get(i) >= mayor2) mayor2 = numeros.get(i);
      }
      System.out.println("****************************** ******************************");
      //System.out.println("Y el mayor es "+mayor2);
      System.out.println("Y el mayor es "+Collections.max(numeros));
      System.out.print("****************************** ******************************");
   }

// Funcion que detecta el error si el parametro ingresado no es entero.
   public static boolean esEntero(String numero) {
      int num;
      try {
         num = Integer.parseInt(numero);
         return true;
      } catch (NumberFormatException ex) {
         return false;
      }
   }
}