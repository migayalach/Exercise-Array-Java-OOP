/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Main {

    private String optionMenu = "No";
    private int size;
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        do {
            subSectionsMenu();
            int option = sc.nextInt();
            System.out.println("Usted eligio la opcion: " + option);
            if (option >= 1 && option <= 6) {
                optionMenu(option);
            } else if (option != 0) {
                System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
            dataOptionMenu();
        } while (optionMenu.equalsIgnoreCase("SI"));
        System.out.println("Bye and good day");
        sc.close();
    }

    public void optionMenu(int option) {
        Exercise exercise = null;
        switch (option) {
            case 1:
                exercise = new ExerciseOne(dataInput());
                exercise.ejecution();
                exercise.showArray();
                break;
            case 2:
                exercise = new ExerciseTwo(dataInput());
                exercise.ejecution();
                exercise.showArray();
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            default:
                throw new AssertionError();
        }
    }

    public int dataInput() {
        try {
            System.out.print("Introduzca una dimension para el array: ");
            size = sc.nextInt();
            return size;
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese un número entero válido.");
            return dataInput();
        }
    }

    private String dataOptionMenu() {
        try {
            System.out.print("\nDesea elegir otro ejercicio: SI, NO: ");
            String input = sc.next().toUpperCase();
            if ("SI".equals(input) || "NO".equals(input)) {
                return optionMenu = input;
            } else {
                System.out.println("Error: Ingrese una opción válida (SI o NO).");
                return dataOptionMenu();
            }
        } catch (java.util.InputMismatchException e) {
            sc.next();
            System.out.println("Error: Ingrese una opción válida (SI o NO).");
            return dataOptionMenu();
        }
    }

    private void subSectionsMenu() {
        System.out.println("1: Ejercicio 1");
        System.out.println("2: Ejercicio 2");
        System.out.println("3: Ejercicio 3");
        System.out.println("4: Ejercicio 4");
        System.out.println("5: Ejercicio 5");
        System.out.println("6: Ejercicio 6");
    }

    public static void main(String args[]) {
        Main main = new Main();
        main.menu();
    }
}
