package com.clientes;

import com.clases.BeneficiosCovid19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code her

        /**
         * Crear 2 lista de beneficios para clientes Lista 1 y Lista 2 por ejemplo
         * Ejemplo:
         * id:12121
         * nombre: Beneficiados que perdieron su trabajo por COVID19
         * valorSubsidio: 150000
         *
         * Ejemplo:
         * id:895656
         * Nombre: Beneficios para persona tercera edad dagnificados COVID
         * valorSubsidio:200000
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lista Uno\n" + "Ingrese el nombre del beneficio: ");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese el valor: ");
        String valor1 = scanner.nextLine();

        BeneficiosCovid19 beneficio1 = new BeneficiosCovid19();
        List<BeneficiosCovid19> beneficios1 = new ArrayList<>();
        beneficio1.setId(getIdBeneficio());
        beneficio1.setNombre(nombre1);
        beneficio1.setValorSubsidio(valor1);
        beneficios1.add(beneficio1);

        System.out.println("\n Lista Dos \n" + "Ingrese el nombre del beneficio: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el valor: ");
        String valor2 = scanner.nextLine();

        BeneficiosCovid19 beneficio2 = new BeneficiosCovid19();
        List<BeneficiosCovid19> beneficios2 = new ArrayList<>();
        beneficio2.setId(getIdBeneficio());
        beneficio2.setNombre(nombre2);
        beneficio2.setValorSubsidio(valor2);
        beneficios2.add(beneficio2);

        compararList(beneficios1, beneficios2);
    }

    /**
    * Implementa un metodo que entregue un reporte de comparacion de las 2 listas este metodo solo imprimira regiostros
    * Cuando un metodo no retorna un tipo de datos se trabaja con la palabra clave VOID
    * Abarcar los operadores terniarios para condiciones logicas
    * Operadores logicos
    * Operacionres aritmeticos
    **/
    public static void compararList(List<BeneficiosCovid19> beneficios1, List<BeneficiosCovid19> beneficios2) {
        BeneficiosCovid19 mejorBeneficio = new BeneficiosCovid19();
        Float resultado = 0F;
        String id = "";
        String nombre = "";
        Float vlrSubsidio = 0F;

        resultado = mejorBeneficio.getMejorbeneficios(beneficios1.get(0).getValorSubsidio().toString(), beneficios2.get(0).getValorSubsidio().toString());

        if (resultado.equals(beneficios1.get(0).getValorSubsidio())){
            id = beneficios1.get(0).getId();
            nombre = beneficios1.get(0).getNombre();
            vlrSubsidio = beneficios1.get(0).getValorSubsidio();
        }else{
            id = beneficios2.get(0).getId();
            nombre = beneficios2.get(0).getNombre();
            vlrSubsidio = beneficios2.get(0).getValorSubsidio();
        }

        System.out.println("\n El Mejor Beneficio Es El Siguiente: \n"
                            + " Id : " + id + "\n Nombre: " + nombre + "\n Valor Subsidio: " + vlrSubsidio);
    }

    //Implementa un metodo que te entregue un numero aletorio para el id de los beneficios usar el wrapper de Integer
    private static String getIdBeneficio(){
        //La Clase Math tiene varios metodos que te ayudaran
        return String.valueOf((int)Math.floor(Math.random()*(00001-(99999))+(99999)));
    }

}
