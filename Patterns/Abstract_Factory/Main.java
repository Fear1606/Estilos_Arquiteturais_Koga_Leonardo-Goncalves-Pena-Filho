package Patterns.Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        
        // define a fábrica desejada (troque para FabricaIOS para mudar a interface)
        Fabricas fabrica = new FabricaAndroid();
        
        renderizarAplicacao(fabrica);
    }

    // fluxo principal (DIP): depende apenas da interface, eliminando os if/else
    public static void renderizarAplicacao(Fabricas fabrica) {
        
        // renderiza os componentes sem precisar saber qual é o sistema operacional
        Botao botao = fabrica.criarBotao();
        Input input = fabrica.criarInput();

        botao.renderizarBotao();
        input.renderizarInput();
    }
}