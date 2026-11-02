package Patterns.Factory_Method;

public class FabricaEmail extends FabricaNotificacoes {
    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioEmail();
    }
}
