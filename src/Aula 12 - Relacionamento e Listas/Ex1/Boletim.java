package Aula_12.Ex1;

public class Boletim {

    public void imprimirStatus(Aluno a){
        if(a.getNotaFinal()>=6){
            System.out.println("Aluno Aprovado!");
        }
        else{
            System.out.println("Aluno Reprovado!");
        }

    }
}
