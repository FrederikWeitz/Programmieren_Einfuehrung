package org.example.arrays;

public enum ChessFigures {
  BAUER('-'),
  TURM('+'),
  LÄUFER('x'),
  SPRINGER('&'),
  DAME('*'),
  KÖNIG('#'),
  LEER('.');

  private final char figImage;

  ChessFigures(char figImage) {
    this.figImage = figImage;
  }

  public char getSymbol() {
    return figImage;
  }
}
