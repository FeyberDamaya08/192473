
    import java.util.Scanner;
    public class Ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final byte NOTAS_TOTALES = 3;
        int n=1;
        int a=0;
        for(int e=1;e<=4;e++) {
        System.out.println("estudiante"+e);
        System.out.println("Ingrese la nota 1");
        float nota1 = input.nextFloat();
        System.out.println("Ingrese la nota 2");
        float nota2 = input.nextFloat();
        System.out.println("Ingrese la nota 3");
        float nota3 = input.nextFloat();
        float prom = (nota1+nota2+nota3)/3;
        if (prom>=3) {
            System.out.println("Aprobo");
            a++;
        }
        System.out.println("Sacaste "+prom);
        }
        System.out.println(+a+" estudiantes aprobaron");
        input.close();
        }
        
    }


