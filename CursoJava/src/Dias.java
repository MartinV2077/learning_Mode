
import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el número del día: ");
        int dia = leer.nextInt();
        String nombreDia = null;

        switch (dia) {
            case 1:
                nombreDia = "Domingo";
                break;
            case 2:
                nombreDia = "Lunes";
                break;
            case 3:
                nombreDia = "Martes";
                break;
            case 4:
                nombreDia = "Miercoles";
                break;
            case 5:
                nombreDia = "Jueves";
                break;
            case 6:
                nombreDia = "Viernes";
                break;
            case 7:
                nombreDia = "Sábado";
                break;
            default:
                System.out.println("Numero del día incorrecto");
        }

        System.out.println(nombreDia);
    }
}