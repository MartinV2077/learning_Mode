import java.util.Scanner;
public class esPar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un Número Entero: ");
        int n = leer.nextInt();

        if (n % 2 == 0){
            System.out.printf("El número %d es PAR\n",n);
        }else{
            System.out.printf("El número %d es IMPAR\n",n);
        }
    }
}
