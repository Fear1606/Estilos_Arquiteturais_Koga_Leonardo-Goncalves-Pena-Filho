package Patterns.Factory_Method;

public class EnvioEmail implements IntNotificacoes {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}