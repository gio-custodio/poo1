package com.poo1.modelo;

public abstract class Docente extends Funcionario {
  public TitulacaoDocente titulacao;

  public enum TitulacaoDocente {
    Graduação, Mestrado, Doutorado, LivreDocente, Titular
  }
}
