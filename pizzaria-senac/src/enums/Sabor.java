package enums;

public enum Sabor {
  CALABRESA("Calabresa"), CHOCOLATE_MORANGO("Chocolate com morango"), QUATRO_QUEIJOS("Quatro-queijos"),
  BASCA("Basca"), FRANGO_CATUPIRY("Frango com catupiry");

  private String sabor;

  private Sabor(String sabor) {
    this.sabor = sabor;
  }

  @Override
  public String toString() {
    return this.sabor;
  }
}
