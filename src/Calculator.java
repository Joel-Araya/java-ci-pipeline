import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        boolean calculando=true;
        int x,y;

        int menu;

        Scanner scanner = new Scanner(System.in);

        while (calculando){
            System.out.println("Indique la operación que desea realizar");
            System.out.println("(1) Suma        (2) Resta           (3) Multiplicación          (4) División            (5) Salir");


            menu= Integer.parseInt(scanner.next());

            switch (menu){
                case 1:
                    System.out.println("Ingrese el valor del primer número");
                    x = Integer.parseInt(scanner.next());
                    System.out.println("Ingrese el valor del segundo número");
                    y = Integer.parseInt(scanner.next());
                    System.out.println("El valor de la suma es " + suma(x,y) + "\n");
                    break;

                case 2:
                    System.out.println("Ingrese el valor del primer número");
                    x = Integer.parseInt(scanner.next());
                    System.out.println("Ingrese el valor del segundo número");
                    y = Integer.parseInt(scanner.next());
                    System.out.println("El valor de la resta es " + resta(x,y) + "\n");
                    break;

                case 3:
                    System.out.println("Ingrese el valor del primer número");
                    x = Integer.parseInt(scanner.next());
                    System.out.println("Ingrese el valor del segundo número");
                    y = Integer.parseInt(scanner.next());
                    System.out.println("El valor de la multiplicación es " + multiplicar(x,y) + "\n");
                    break;

                case 4:
                    System.out.println("Ingrese el valor del primer número");
                    x = Integer.parseInt(scanner.next());
                    System.out.println("Ingrese el valor del segundo número");
                    y = Integer.parseInt(scanner.next());
                    System.out.println("El valor de la division es " + dividir(x,y) + "\n");
                    break;

                case 5:
                    calculando=false;
                    System.out.println("Deteniendo el programa...");
            }
        }
    }

    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
    public static float dividir(float a, float b){
        return a/b;
    }

}
