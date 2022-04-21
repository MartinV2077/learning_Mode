
public class ClaseString {
    public static void main(String[] args) {
        String nombre = "Oregoom";
        System.out.println(nombre.charAt(3));

        //Salida 
         // g
         
         String nombre2 = "Oregoom";
        System.out.println("Cantidad de Caracteres: "+ nombre.length());
        //Salida 
        // Cantidad de Caracteres: 7
        
        for(int i = 0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
        
        String nombre3 = "Oregoom";
        System.out.println("Troso: "+ nombre.substring(3));
        //Salida
        // goom

        System.out.println("Troso: "+ nombre.substring(0, 3));
         //Salida
        // Ore
        
        System.out.println("Minúscula: "+ nombre.toLowerCase());
        //Salida
        // oregoom
        
        System.out.println("Mayúscula: "+ nombre.toUpperCase());
        //Salida
        // OREGOOM
        
        System.out.println("Remplazar: "+ nombre.replace(" ", "-"));
        //Salida
        // Remplazar: O-r-e-g-o-o-m
        System.out.println("hola".equals("Hola"));
        
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        
        nuevo.append("Hola ");
        nuevo.append("Mundo");
        
        System.out.println(nuevo.toString());
    }
 
}
