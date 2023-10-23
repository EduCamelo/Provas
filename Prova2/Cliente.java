public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    protected Item[] carrinhoDeCompras;
    protected int aux;//Eu implementei isso daq para usar no vetor e para saber quantos itens tem no ngc

    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = new Item[100];
        this.aux =0;
    }

    public int getAux() {
        return aux;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(Item[] carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public void adicionar(Item novo){
        this.carrinhoDeCompras[aux] = novo;
        this.carrinhoDeCompras[aux].setQtdEstoque(-1);
        aux++;
    }

    public void remover(int cod){
        for(int i =0; i<aux;i++){
            if(this.carrinhoDeCompras[i].getCodigo() == cod){
                this.carrinhoDeCompras[i] = null;
            }
        }
    }

    public double finalizarCompra(){
        double VF =0;// valor final
        for(int i = 0; i<aux; i++){
            VF += this.carrinhoDeCompras[i].getValor();
            this.carrinhoDeCompras[i] = null;
        }
        aux = 0;
        return VF;
    }

}
