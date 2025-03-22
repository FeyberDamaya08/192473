import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        final byte MAYOR_EDAD = 18;
        final int EDAD_MAXIMA = 120;
        final int EDAD_MINIMA = 1;
        int C = 0;
        int edadIngresada1 = 0, edadIngresada2= 0, edadIngresada3 = 0;
        System.out.println("Número de usuarios a ingresar:");
        String nombreUsu1 = "", nombreUsu2 = "", nombreUsu3 = "";
        int numeroUsuarios = input.nextInt();
        input.nextLine();
        while (C < numeroUsuarios) {
            System.out.println("Nombre del usuario:");
            String nombreEntrada = input.nextLine();

            System.out.println("Edad del usuario:");
            int edad = input.nextInt();
            input.nextLine();

            if (C == 0) {
                nombreUsu1 = nombreEntrada;
                edadIngresada1 = edad;
            } else if (C == 1) {
                nombreUsu2 = nombreEntrada;
                edadIngresada2 = edad;
            } else if (C == 2) {
                nombreUsu3 = nombreEntrada;
                edadIngresada3 = edad;
            }

            if (edad >= MAYOR_EDAD) {
                System.out.println(nombreEntrada + " es mayor de edad.");
            } else {
                System.out.println(nombreEntrada + " es menor de edad.");
            }

            if (edad > EDAD_MAXIMA || edad < EDAD_MINIMA) {
                System.out.println("Edad no válida.");
            }

            C = C + 1;
        }

        System.out.println("Resumen:");
        System.out.println("Usuario 1: " + nombreUsu1 + " - Edad: " + edadIngresada1);
        System.out.println("Usuario 2: " + nombreUsu2 + " - Edad: " + edadIngresada2);
        System.out.println("Usuario 3: " + nombreUsu3 + " - Edad: " + edadIngresada3);
    }
}
