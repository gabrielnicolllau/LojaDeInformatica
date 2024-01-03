package controller;

import views.TelaLogin;

/**
 * Classe principal que contém o método main para iniciar a aplicação.
 * Cria uma instância da classe TelaLogin e a torna visível ao iniciar o programa.
 */

public class Main {

    /**
     * Método principal que inicia a aplicação.
     *
     * @param args Argumentos da linha de comando (não utilizados neste contexto).
     */
    
    public static void main(String[] args) {
        // Cria uma nova instância da tela de login
        TelaLogin novaTelaPrincipal = new TelaLogin();
        
        // Torna a tela de login visível
        novaTelaPrincipal.setVisible(true);
    }

}
