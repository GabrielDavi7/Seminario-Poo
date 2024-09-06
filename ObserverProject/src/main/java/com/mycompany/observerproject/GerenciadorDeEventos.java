package com.mycompany.observerproject;

import java.util.*;

class GerenciadorDeEventos {
    private Map<String, List<OuvinteDeEvento>> ouvintes = new HashMap<>();

    public void inscrever(String tipoDeEvento, OuvinteDeEvento ouvinte) {
        ouvintes.computeIfAbsent(tipoDeEvento, k -> new ArrayList<>()).add(ouvinte);
    }

    public void desinscrever(String tipoDeEvento, OuvinteDeEvento ouvinte) {
        List<OuvinteDeEvento> usuarios = ouvintes.get(tipoDeEvento);
        if (usuarios != null) {
            usuarios.remove(ouvinte);
        }
    }

    public void notificar(String tipoDeEvento, String dado) {
        List<OuvinteDeEvento> usuarios = ouvintes.get(tipoDeEvento);
        if (usuarios != null) {
            for (OuvinteDeEvento ouvinte : usuarios) {
                ouvinte.atualizar(dado);
            }
        }
    }
}
