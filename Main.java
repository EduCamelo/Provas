public class Main {
    public static void main(String[] args) {
        Empresa x = new Empresa("Camelo", "182930812703", "casa do caralho","Sr. Camelo");
        Trabalhador y = new Trabalhador("corno manso", 19, 10);

        x.contratar(y);
        x.trabalhar();
        x.calcularPagamento();
        y.ferias();
        x.calcularPagamento();
    }   
}
