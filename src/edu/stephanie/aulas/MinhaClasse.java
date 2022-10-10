package edu.stephanie.aulas;
public class MinhaClasse {
  
  public static void main(String[] args) {
    String primeiroNome = "Stephanie";
    String sobrenome = "Campelo";
    String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);
   
    double [] notas = {6.5d, 5d , 5.5d, 7d};

    String media = verificarAprovacao(nomeCompleto, notas);
    System.out.println(media);
    
  }

  public static String nomeCompleto(String primeiroNome, String sobrenome){
    return primeiroNome + " " + sobrenome;
  }

  public static double calcularMedia(double [] notas) {
    double media = 0d;

    for (double nota : notas) {
      media += nota; 
    }
    media /= notas.length;

    return media;
  }

  public static String verificarAprovacao(String nomeAluno, double [] notas) {
    double media = calcularMedia(notas);
    String mensagem;
    String motivoReprovacao;

    boolean frequenciaAulas = true;

    if(media >= 7 && frequenciaAulas){
      mensagem = "APROVADO _ MEDIA = " + media;
    } else{
      //chamar pais/responsavel
      motivoReprovacao = media < 7? "NOTA" : "FREQUENCIA"; 
      mensagem = chamarResponsavel(nomeAluno, motivoReprovacao);
    }
  
    return mensagem;
  }

  public static String chamarResponsavel(String aluno, String motivoReprovacao) {
    String mensagem = "Comunicado reprovação do aluno(a): " + aluno + " " + motivoReprovacao + " INSUFICIENTE";
    return mensagem;
  }
}
