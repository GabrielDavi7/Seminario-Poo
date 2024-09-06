    package com.mycompany.observerproject;

    class OuvinteDeLogs implements OuvinteDeEvento {
        private String arquivoDeLogs;
        private String mensagem;

        public OuvinteDeLogs(String arquivoDeLogs, String mensagem) {
            this.arquivoDeLogs = arquivoDeLogs;
            this.mensagem = mensagem;
        }

        @Override
        public void atualizar(String nomeDoArquivo) {
            System.out.println(String.format("Log para %s: %s", arquivoDeLogs, String.format(mensagem, nomeDoArquivo)));
        }
    }
