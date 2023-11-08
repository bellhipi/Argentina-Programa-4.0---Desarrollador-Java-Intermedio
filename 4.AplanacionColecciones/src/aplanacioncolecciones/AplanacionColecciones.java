/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplanacioncolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hipol
 */
public class AplanacionColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //------------------MIN------------------
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(1);
        numeros.add(8);
        Integer resultado = Collections.min(numeros);
        
        System.out.println(resultado);
        
        
        //------------------MAX------------------
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(1);
        numeros.add(8);
        Integer resultado = Collections.max(numeros);
        
        System.out.println(resultado);

        
        //------------------SUM------------------
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        numeros.add(1);
        numeros.add(8);
        int suma = numeros.stream().mapToInt(Integer::intValue).sum();
        
        System.out.println(suma);


        //------------------MAX------------------
        
        List<String> textos = new ArrayList<>();
        textos.add("Primero");
        textos.add("Segundo");
        textos.add("Tercero");
        String textoResultante = textos.stream().collect(Collectors.joining());
        
        System.out.println(textoResultante);
        
        //con separador
        String textoResultante = textos.stream().collect(Collectors.joining(", "));
        
        System.out.println(textoResultante);

    }

}
