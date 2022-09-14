import java.util.Scanner;

public class RepasoJava {

    public static void main(String[] args) {
        
        // Ejercicio 1
        String nombre = "Pedro";
        int edad = 20;
        System.out.println("Los datos del empleado son: " + nombre + " " + edad);

        //Ejercicio 2
        System.out.println("Introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edadSc = sc.nextInt();

        if (edadSc >= 18) {
            System.out.println("Eres mayor de edad");
        } else{
            System.out.println("Eres menor de edad");
        }

        
        //Ejercicio 3
        System.out.println("Introduce tu nombre");
        String nombreSc = sc.nextLine();
        System.out.println("Introduce tu correo");
        String emailSc = sc.nextLine();

        System.out.println("Nombre: " + nombreSc + " Email: " + emailSc);

        //Ejercicio 4
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        while(num != 5) {
            int num1 = sc.nextInt();
            if(num1 == 5) {
                System.out.println("Fin del programa");
                sc.close();
            }
        }

        //Ejercicio 5
        System.out.println("Introduce un número entre 1 y 50");
        int numEntreValores = sc.nextInt();
        while(numEntreValores < 0 || numEntreValores > 50 ) {
            System.out.println("El número no es valido");
            int numValido = sc.nextInt();
            if(numValido > 0 && numValido < 50) {
                if (numEntreValores % 2 == 0) {
                    System.out.println("El número es par");
                }else{
                    System.out.println("El número es impar");
                }
            }
        }
        //Ejercicio 6
        String[] array = {"Pedro","Juan", "Eduard","Jeremy","Agus"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //Ejercicio 7
        for (String i : array) {
            System.out.println(i);
        }

    }

}

