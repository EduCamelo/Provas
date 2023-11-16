package Prova3;
public class Aluno extends Usuario implements IOperacoes{
    private String curso;
    private String matricula;
    private double[] notas = new double[3];
    private boolean[] presencas = new boolean[20];
    private boolean status;
    private int aux = 0;
    @Override
    public double media() {
        int cont =0;
        for (int i = 0; i < presencas.length; i++) {
            if(presencas[i] == false){
                cont++;
            }
            if(cont == 5){
                return -1;
            }
        }
        double cont2=0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] == 0){
                System.out.println("O aluno está com uma nota pendente");
                return -1;
            }else{
            cont2 += notas[i];
            }
        }
        cont2 = cont2/3;
        if(cont2 >= 7){
            System.out.println("Aprovado por media");
            return cont2;
        }else if(cont2 >= 5  && cont2 <7){
            System.out.println("Aprovado");
            return cont2;
        }else{
            System.out.println("Reprovado");
            return cont2;
        }
    }
    @Override
    public void presenca() {
     int cont1=0;
     int cont2 =0;
        for (int i = 0; i < presencas.length; i++) {
        if(presencas[i] == true){
            cont1++;
        }else{
            cont2++;
        }
     }
     System.out.println("Faltas: "+ cont2);
     System.out.println("Presenças: "+ cont1);
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public void setPresencas(boolean x) {
        this.presencas[aux] = x;
        aux++;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getCurso() {
        return curso;
    }
    public String getMatricula() {
        return matricula;
    }
    public double[] getNotas() {
        return notas;
    }
    public boolean[] getPresencas() {
        return presencas;
    }
    public boolean isStatus() {
        return status;
    }
    public int getAux() {
        return aux;
    }
    @Override
    public void atividade() {
        System.out.println("Assistindo a aula");
        throw new UnsupportedOperationException("Unimplemented method 'atividade'");
    }

    

}
