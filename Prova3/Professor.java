package Prova3;
import java.util.Random;

public class Professor extends Usuario implements IOperacoes{
    private String curso;
    private String matricula;
    private Aluno[] alunos = new Aluno[10];
    @Override
    public double media() {
        try {
            for (int i = 0; i < alunos.length; i++) {
              double  verifica = alunos[i].media();
                if(verifica == -1){
                    verifica = verifica/0;
                }
            }
            System.out.println("Media da turma calculada com sucesso");
            return 1;
        } catch (Exception e) {
            System.out.println("Turma não pode ser finalizada");
        }
        throw new UnsupportedOperationException("Unimplemented method 'media'");
    }
    @Override
    public void presenca() {
        Random random = new Random();
        for (int i = 0; i < alunos.length; i++) {
            double x = random.nextDouble(0,1);
            if(x >= 0.8){
                alunos[i].setPresencas(true);
            }else{
                alunos[i].setPresencas(false);
            }
        } 
        throw new UnsupportedOperationException("Unimplemented method 'presenca'");
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Aluno[] getAlunos() {
        return alunos;
    }
    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    @Override
    public void atividade() {
        System.out.println("Está lecionando  para :"+ alunos);
        throw new UnsupportedOperationException("Unimplemented method 'atividade'");
    }

    public boolean getAluno(Aluno x){
        for (int i = 0; i < alunos.length; i++) {
            if(x == alunos[i]){
                return true;
            }
        }
        return false;
    }

}
