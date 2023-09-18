public class Empresa{
    private String nome;
    private String cnpj;
    private Trabalhador[] trabalhadores;
    private String endereco;
    private int NumDeFuncionarios;
    private String CEO;
    
    public Empresa(String nome, String cnpj, String endereco, String cEO){
        this.nome = nome;
        this.cnpj = cnpj;
        this.trabalhadores = new Trabalhador[20];
        this.endereco = endereco;
        this.NumDeFuncionarios = 0;
        this.CEO = cEO;
    }


    public void contratar(Trabalhador efetivado){
        if(NumDeFuncionarios < 20){
            this.trabalhadores[this.NumDeFuncionarios] = efetivado;
        NumDeFuncionarios++;
        System.out.println("Trabalhador contratado com sucesso!");
        }
        else{
            System.out.println("Não dá para contratar!");
        }
    }

    public void trabalhar(){
        for (int i = 0; i<NumDeFuncionarios;i++) {
            if(this.trabalhadores[i].isFerias() != true){
                this.trabalhadores[i].setHorasTrab(8);
            }
        }
    }

    public void calcularPagamento(){
        double valorTotal =0;
        for (int i = 0; i<NumDeFuncionarios;i++) {
            System.out.println(this.trabalhadores[i].getNome() + ", vai receber: R$"+ (this.trabalhadores[i].getValorHora()*this.trabalhadores[i].getHorasTrab()));
             valorTotal+= this.trabalhadores[i].getValorHora()*this.trabalhadores[i].getHorasTrab();
        }
        System.out.println("Valor total a ser pago aos funcionarios pela empresa: R$"+ valorTotal);
    }

}