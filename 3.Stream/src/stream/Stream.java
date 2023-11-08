/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author hipol
 */
public class Stream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //------------------FOR EACH------------------
        //forEach
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.stream().forEach((numero) -> System.out.println(numero));

        //------------------ANY MATCH------------------
        //anyMatch
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        boolean coincide = numeros.stream().anyMatch((numero) -> numero > 3);

        System.out.println(coincide);

        //con otra condicion
        // boolean coincide = numeros.stream().anyMatch((numero) -> numero > 2);
        
        //System.out.println(coincide);
        
        //------------------ALL MATCH------------------
        //allMatch
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        boolean coincide = numeros.stream().allMatch((numero) -> numero > 1);

        System.out.println(coincide);

        //con otra condicion
        //boolean coincide = numeros.stream().allMatch((numero) -> numero > 0);
        
        //System.out.println(coincide);
        
        //------------------MAP------------------
        //map
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jose"));
        personas.add(new Persona("Maria"));
        personas.add(new Persona("Carlos"));

        System.out.println(personas.toString());

        //paso de list de Persona a list de String
        List<String> personasString = personas.stream().map((persona) -> persona.getNombre()).collect(Collectors.toList());

        System.out.println(personasString.toString());

        //paso de list de String a list de Persona
        List<Persona> otroListadoDepersonas = personasString.stream().map(persona -> new Persona(persona)).collect(Collectors.toList());

        System.out.println(otroListadoDepersonas.toString());

        //generar coleccion del mismo tipo
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        List<Integer> numerosDuplicados = numeros.stream().map(numero -> numero * 2).collect(Collectors.toList());
        
        System.out.println(numerosDuplicados);
        
        //paso de list de String a list de Integer, como es primitivo uso boxed
        List<String> numerosString = new ArrayList<>();
        numerosString.add("1");
        numerosString.add("2");
        numerosString.add("3");
        
        List<Integer> numeros = numerosString.stream().mapToInt(numero -> Integer.valueOf(numero)).boxed().collect(Collectors.toList());

        System.out.println(numeros);
    }

}
