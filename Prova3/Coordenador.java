package Prova3;

public class Coordenador {
    private String horarioDeAtendimento;

    public void solicitacaoAluno(Aluno x){
        if(x.isStatus()){
            x.setStatus(false);
        }else{
            x.setStatus(true);
        }
    }

    public void removerTurma(Aluno x, Professor y){
        if(y.getAluno(x)){
            System.out.println("Aluno removido");
        }else{
            System.out.println("Erro: ao tentar remover aluno");
        }
     }
}
