package com.mycompany.observerproject;

class Editor {
    public GerenciadorDeEventos eventos = new GerenciadorDeEventos();
    private String nomeDoArquivo;

    public void abrirArquivo(String caminho) {
        this.nomeDoArquivo = caminho;
        eventos.notificar("abrir", nomeDoArquivo);
    }

    public void salvarArquivo() {
        eventos.notificar("salvar", nomeDoArquivo);
    }
}
