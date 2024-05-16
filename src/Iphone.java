public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar (String numero) {
        System.out.println("Ligando...");
    };
    public void atender () {
        System.out.println("Atendendo ligação...");
    };
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz..");
    };
    public void exibirPagina() {
        System.out.println("Exibindo Pagina...");
    };
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    };
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    };
    public void tocar() {
        System.out.println("Tocando...");
    };
    public void pausar() {
        System.out.println("pausar");
    };
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada " + musica);
    };
    
}
