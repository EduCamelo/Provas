public class Item {
    private String nome;
    private int codigo;
    private double valor;
    private int qtdEstoque;
    private boolean disponibilidade;
   
   public Item(String nome, int codigo, double valor, int qtdEstoque, boolean disponibilidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
        this.disponibilidade = disponibilidade;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque += qtdEstoque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade() {
        this.disponibilidade = !this.disponibilidade;
    }

    
}
