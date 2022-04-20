import java.util.Scanner;
public class MultiFor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = leer.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",n,i,(n * i));
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        
        int c = 0;

        while (c <= 10){
            System.out.println(c);
            c++;

            if (c == 5){
                System.out.println("Detener el ciclo while");
                //Rompe el ciclo while
                break;
            }
        }
    }
}


---------

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<=10; i++){
            System.out.println(i);
            
            if (i == 5){
                System.out.println("Detener el ciclo for");
                //Rompe el ciclo for
                break;
            }
        }
    }
}

--------------------

public class Main {
    public static void main(String[] args) {
        
        int c = 0;

        while (c <= 10){

            c++;
            System.out.println("Ejecución "+ c);
            
            if (c == 5){
                System.out.println("Saltar a la siguiente ejecución");
                //Saltar a la siguiente 
                continue;
            }
            
            System.out.println("No me ejecutare en 5");

        }
    }
}

---------------

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<=10; i++){
            System.out.println("Ejecución "+ i);
            
            if (i == 5){
                System.out.println("Saltar a la siguiente ejecución");
                //Saltar a la siguiente 
                continue;
            }
            System.out.println("No me ejecutare en 5");
        }
    }
}
*/