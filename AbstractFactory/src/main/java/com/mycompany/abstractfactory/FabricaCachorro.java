package com.mycompany.abstractfactory;

public class FabricaCachorro implements FabricaAnimal {
    @Override
    public Animal criarAnimal() {
        return new Cachorro();
    }
}
