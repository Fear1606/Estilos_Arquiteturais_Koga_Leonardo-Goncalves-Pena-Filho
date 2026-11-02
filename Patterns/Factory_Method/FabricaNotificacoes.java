package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {
    
    // método abstrato: cada subclasse decidirá o que retornar
    public abstract IntNotificacoes criarNotificacoes();

    // fluxo comum herdado pelas subclasses
    public void notificar(String mensagem) {
        IntNotificacoes notificacao = criarNotificacoes();
        
        notificacao.enviarMensagem(mensagem); 
    }
}