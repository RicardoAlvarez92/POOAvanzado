package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNombre("Ricardo Alvarez"+ "\n");
        cuenta.setClave("ABC-123");
        cuenta.setSaldo(1000000000);

        System.out.print(cuenta.getNombre());
        cuenta.mostrarsaldo();

        /*Animal animal = new Animal();
        animal.nombre ="iguana";
       Persona persona= new Persona();
        persona.nombre = "ricardo";
        persona.edad = 29;*/
    }
}
