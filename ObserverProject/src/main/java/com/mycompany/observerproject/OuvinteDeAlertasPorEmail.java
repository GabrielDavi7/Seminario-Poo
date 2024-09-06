package com.mycompany.observerproject;

class OuvinteDeAlertasPorEmail implements OuvinteDeEvento {
    private String email;
    private String mensagem;

    public OuvinteDeAlertasPorEmail(String email, String mensagem) {
        this.email = email;
        this.mensagem = mensagem;
    }

    @Override
    public void atualizar(String nomeDoArquivo) {
        System.out.println(String.format("Enviando email para %s: %s", email, String.format(mensagem, nomeDoArquivo)));
    }
}
