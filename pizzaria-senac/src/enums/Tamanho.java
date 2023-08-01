package enums;

public enum Tamanho {
  PEQUENA("Pequena", 28.0f), MEDIA("Média", 42.0f), GRANDE("Grande", 60.0f);

  private String tamanho;
  private float valor;

  private Tamanho(String tamanho, float valor) {
    this.tamanho = tamanho;
    this.valor = valor;
  }

  public float getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return this.tamanho;
  }
}
