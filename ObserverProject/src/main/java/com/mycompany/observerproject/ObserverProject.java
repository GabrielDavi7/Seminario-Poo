package com.mycompany.observerproject;

public class ObserverProject {
    public static void main(String[] args) {
        Editor editor = new Editor();

        OuvinteDeLogs logger = new OuvinteDeLogs(
            "/caminho/para/log.txt",
            "Alguém abriu o arquivo: %s");
        editor.eventos.inscrever("abrir", logger);

        OuvinteDeAlertasPorEmail alertasPorEmail = new OuvinteDeAlertasPorEmail(
            "admin@exemplo.com",
            "Alguém alterou o arquivo: %s");
        editor.eventos.inscrever("salvar", alertasPorEmail);

        editor.abrirArquivo("arquivoPooSeminario.txt");
        editor.salvarArquivo();
    }
}
