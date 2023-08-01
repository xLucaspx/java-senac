package models;

public class Cliente {
  private String nome;
  private String telefone;
  private String endereco;
  private String cidade;
  
  public Cliente(String nome, String telefone, String endereco, String cidade) {
    setNome(nome);
    setTelefone(telefone);
    setEndereco(endereco);
    setCidade(cidade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  @Override
  public String toString() {
    return String.format("Cliente: %s\nTelefone: %s\n Endereço: %s, %s", nome, telefone, endereco, cidade);
  }
  
  
}
