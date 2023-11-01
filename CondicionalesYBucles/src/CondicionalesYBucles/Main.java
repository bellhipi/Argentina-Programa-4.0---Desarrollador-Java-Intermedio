package CondicionalesYBucles;

public class Main {

    public static void main(String[] args) {

        //Ejemplo de if
        int edad = 17;

        if (edad > 18) {
            System.out.println("es mayor");
        }

        //Ejemplo de if else
        if (edad > 18) {
            System.out.println("es mayor");
        } else {
            System.out.println("es menor");
        }

        //Ejemplo de if anidado
        if (edad > 18) {
            System.out.println("es mayor");
        } else if (edad > 16) {
            System.out.println("puede votar");
        } else {
            System.out.println("es menor");
        }

        //Ejemplo de switch
        String idioma = "bn,bm b ";
        switch (idioma) {
            case "esp":
                System.out.println("hola");
                break;
            case "fra":
                System.out.println("salut");
                break;
            case "eng":
                System.out.println("hello");
                break;
            default:
                System.out.println("chao");
        }

        //Ejemplo de while
        int unNum = 10;
        while (unNum > 0) {
            System.out.println(unNum);
            unNum = unNum - 1;
        }

        //Ejemplo de do while
        unNum = -1;
        do {
            System.out.println(unNum);
            unNum = unNum - 1;
        } while (unNum > 0);

        //Ejemplo de for
        int otroNum = 0;
        for (otroNum = 0; otroNum < 10; otroNum++) {
            System.out.println(otroNum);
        }

    }

}
