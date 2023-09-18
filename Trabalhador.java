public class Trabalhador {
    private String nome;
    private int idade;
    private double valorHora;
    private int horasTrab;

    private boolean ferias;

    public boolean isFerias() {
        return ferias;
    }

    public Trabalhador(String nome, int idade, double valorHora) {
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horasTrab = 0;
        this.ferias = false;
    }
    public void setHorasTrab(int horasTrab) {
        this.horasTrab += horasTrab;
        }
    
    public void ferias() {
        this.ferias = !this.ferias;
    }

    public double getValorHora() {
        return valorHora;
    }

    public String getNome() {
        return nome;
    }

    public double VAR(){
        double valor = this.valorHora * horasTrab;
        return valor;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

}
