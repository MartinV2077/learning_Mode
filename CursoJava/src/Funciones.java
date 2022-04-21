public class Funciones {
    public static void main(String[] args) {
       //Llamar a una función
        saludar();
        
    }
    //Definición de una función
    static void saludar(){
        System.out.println("Hola Mundo");
    }
}

/*
public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        sumar(4, 5);

    }
    //Definición de una función
    static void sumar(int a, int b){
        int r = a + b;
        System.out.println("La Suma: "+ r);
    }
}
__________________

public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        datos("Alex", 25);

    }
    //Definición de una función
    static void datos(String nombre, int edad){
        System.out.printf("Nombre: %s \nEdad: %d",nombre, edad);
    }
}
        //Salida es:
         //Nombre: Alex
        //Edad: 25

___________________

public static void main(String[] args) {
        //Llamar a una función
        int r = sumar(10, 20);

        System.out.println("La Suma es: "+ r);

    }
    //Definición de una función
    static int sumar(int a, int b){
        return a + b;
    }
}
        //Salida es:
         //La Suma es: 30

_____________________________

public static void main(String[] args) {
        //Llamar a una función
        System.out.println(datos("Alex", 25));

    }
    //Definición de una función
    static String datos(String nombre, int edad){

        return "Nombre: " + nombre + "\nEdad: "+edad;
    }
}
        //Salida es:
         //Nombre: Alex
        //Edad: 25


__________

public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        int suma1 = sumarEnteros(30,50);
        double suma2 = sumarDecimal(2.5 , 3.5);

        System.out.println("Entero: "+ suma1);
        System.out.println("Decimal: "+ suma2);

    }
    //Definición de una función

    static int sumarEnteros(int a, int b){
        return a + b;
    }

    static double sumarDecimal(double a, double b){
        return a + b;
    }
}
        //Salida es:
         //Entero: 80
        //Decimal: 6.0


_________


public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        int suma1 = sumar(30,50);
        double suma2 = sumar(2.5 , 3.5);

        System.out.println("Entero: "+ suma1);
        System.out.println("Decimal: "+ suma2);

    }
    //Definición de una función
    static int sumar(int a, int b){
        return a + b;
    }

    static double sumar(double a, double b){
        return a + b;
    }
}
        //Salida es:
         //Entero: 80
        //Decimal: 6.0

_________________

public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        cuentaRegresiva(10);

    }
    //Definición de una función
    static void cuentaRegresiva(int numero){
        numero --;

        if (numero > 0){
            System.out.println(numero);
            //Llamar la misma función
            cuentaRegresiva(numero);
        }else {
            System.out.println("LLego hasta 0");
        }
    }
}
//Salida es:
//9
//8
//7
//6
//5
//4
//3
//2
//1
//LLego hasta 0

____________________

public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        System.out.println(factorial(5));

    }
    //Definición de una función
    static int factorial(int numero){
        if (numero > 1){
            numero = numero * factorial(numero-1);
        }
        return numero;
    }
}
//Salida es:
//120

______________


public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        System.out.println(sumar(3,5,4,6,2,3,6)); // Igual -> 29

    }
    //Definición de una función
    static int sumar(int... numeros){
        int suma = 0;
        for (int num: numeros){
            suma += num;
        }
        return suma;
    }
}
//Salida es:
//29

public class Main {
    public static void main(String[] args) {
        //Llamar a una función
        variosParametros("Alex", 4,8,9,3,45,63);

    }
    //Definición de una función
    static void variosParametros(String nombre, int...numeros){
        System.out.println("Nombre: "+ nombre);

        int suma = 0;
        for (int num: numeros){
            suma += num;
        }
        System.out.println("La suma es: "+suma);
    }
}
//Salida es:
//2Nombre: Alex
//La suma es: 132

*/
