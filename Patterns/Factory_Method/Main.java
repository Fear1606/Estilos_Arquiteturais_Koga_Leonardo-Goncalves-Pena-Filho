package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        
        // define qual a fábrica concreta a utilizar (pode trocar por new FabricaSMS())
        FabricaNotificacoes fabrica = new FabricaEmail();
        
        // executa o envio sem nenhuma condicional if/else no código
        fabrica.notificar("Mensagem processada via Factory Method!");
    }
}