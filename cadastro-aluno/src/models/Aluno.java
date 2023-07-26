package models;

public class Aluno {

  private String nome;
  private String cpf;
  private String escolaridade;
  private String matricula;

  public Aluno(String nome, String cpf, String escolaridade, String matricula) {
    this.nome = nome;
    this.cpf = cpf;
    this.escolaridade = escolaridade;
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public String getCpf() {
    return cpf;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getEscolaridade() {
    return escolaridade;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s\nCPF: %s\nMatrícula: %s");
  }
}
