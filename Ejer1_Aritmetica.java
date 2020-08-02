import java.util.Scanner;
public class Ejer1_Aritmetica
    {
        public static void main(String[] args)
        {
        int a, b;
        int x1,x2,x3,x4,x5;
        double x6,x7;
        Scanner Tecl = new Scanner(System.in);
        System.out.print("escriba un valor entero para a = ");
        a = Tecl.nextInt();
        System.out.print("escriba un valor entero para b = ");
        b = Tecl.nextInt();
        x1= a + b;
        x2= b - a;
        x3= a * b;
        x4= a / b;
        x5= a % b;
        x6= Math.log(a);
        x7= Math.pow(a,b);
        System.out.println("La suma de a y b = "+x1);
        System.out.println("Restar a de b  = "+x2);
        System.out.println("Multiplicar a por b = "+x3);
        System.out.println("Dividir a entre b = "+x4);
        System.out.println("El residuo de a dividido entre b  = "+x5);
        System.out.println("El logarismo de a = "+x6);
        System.out.println("El resultado de hallar a exponente b  = "+x7);
    }
    }