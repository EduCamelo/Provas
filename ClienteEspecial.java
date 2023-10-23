public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;
    
    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        super(nome, idade, cpf, endereco, bomCliente);
        this.pontos = 0;
        this.saldoDeCompras = 0;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }
    
    public double finalizarCompra(int itemPontos){// cada item custa tantos pontos.
        double VF =0;// valor final
        for(int i = 0; i<aux; i++){
            if(itemPontos < this.pontos){
                this.pontos -= itemPontos;
                this.carrinhoDeCompras[i] = null;
            }
            else{
                VF += this.carrinhoDeCompras[i].getValor();
                this.carrinhoDeCompras[i] = null;
            }
        }
        this.saldoDeCompras = VF*(5/100);
        VF += VF*(5/100);
        if(this.saldoDeCompras > 100){
            this.pontos += 5;
            this.saldoDeCompras -= 100;
        }
        aux = 0;
        return VF;
    }

}
