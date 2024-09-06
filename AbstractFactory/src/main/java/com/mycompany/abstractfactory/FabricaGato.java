package com.mycompany.abstractfactory;

public class FabricaGato implements FabricaAnimal {
    @Override
    public Animal criarAnimal() {
        return new Gato();
    }
}
