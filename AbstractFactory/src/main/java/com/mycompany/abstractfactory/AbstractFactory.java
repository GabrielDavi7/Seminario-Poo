package com.mycompany.abstractfactory;

/**
 *
 * @author Gabriel Davi
 */
public class AbstractFactory {

 public static void main(String[] args) {
        FabricaAnimal fabricaCachorro = new FabricaCachorro();
        Animal cachorro = fabricaCachorro.criarAnimal();
        cachorro.fazerSom(); // saida : Au Au!

        FabricaAnimal fabricaGato = new FabricaGato();
        Animal gato = fabricaGato.criarAnimal();
        gato.fazerSom(); // saida  Miau!
    }
}