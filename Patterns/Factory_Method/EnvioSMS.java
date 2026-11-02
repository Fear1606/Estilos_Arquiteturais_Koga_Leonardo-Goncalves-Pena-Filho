package Patterns.Factory_Method;

public class EnvioSMS implements IntNotificacoes {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}