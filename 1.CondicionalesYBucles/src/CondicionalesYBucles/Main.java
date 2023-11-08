package CondicionalesYBucles;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
//        //------------------IF------------------
//        //Ejemplo de if
//        int edad = 17;
//
//        if (edad > 18) {
//            System.out.println("es mayor");
//        }
//
//        //Ejemplo de if else
//        if (edad > 18) {
//            System.out.println("es mayor");
//        } else {
//            System.out.println("es menor");
//        }
//
//        //Ejemplo de if anidado
//        if (edad > 18) {
//            System.out.println("es mayor");
//        } else if (edad > 16) {
//            System.out.println("puede votar");
//        } else {
//            System.out.println("es menor");
//        }
//        
//        //Operador ternario
//        int x =5;
//        int y =7;
//        int mayor=0;
//        
//        if (x>y)
//           mayor = x;
//        else
//           mayor = y;
//
//        //resultado = (condicion)?valor1:valor2;
//        mayor=(x>y)?x:y; 
        
//
//        //------------------SWITCH------------------
//        //Ejemplo de switch
//        String idioma = "bn,bm b ";
//        switch (idioma) {
//            case "esp":
//                System.out.println("hola");
//                break;
//            case "fra":
//                System.out.println("salut");
//                break;
//            case "eng":
//                System.out.println("hello");
//                break;
//            default:
//                System.out.println("chao");
//        }
//
//        //------------------WHILE------------------
//        //Ejemplo de while
//        int unNum = 10;
//        while (unNum > 0) {
//            System.out.println(unNum);
//            unNum = unNum - 1;
//        }
//
//        //Ejemplo de do while
//        unNum = -1;
//        do {
//            System.out.println(unNum);
//            unNum = unNum - 1;
//        } while (unNum > 0);
//
//        //------------------FOR------------------
//        //Ejemplo de for
//        int otroNum = 0;
//        for (otroNum = 0; otroNum < 10; otroNum++) {
//            System.out.println(otroNum);
//        }


        //For each
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(lista.get(i));
        }

//        for (String cadena : lista) {
//            System.out.println(cadena);
//        }
//       
    }

}
