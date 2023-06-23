package com.poo1.modelo;

public abstract class Funcionario {
  public String codigo;
  public String nome;
  public double salario;
  public NivelFuncionario nivel;

  public enum NivelFuncionario {
    T1, T2, D1, D2, D3, S1, S2
  }

  public abstract double calcularSalario();
}
