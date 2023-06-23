package com.poo1.modelo;

public class Tecnico extends Funcionario {
  public FuncaoFuncionarioTecnico funcao;

  public enum FuncaoFuncionarioTecnico {
    Assesor, Laboratório, Secretário
  }

  @Override
  public double calcularSalario() {
    if (this.nivel.equals(NivelFuncionario.T1)) {
      return salario + (salario * TabelaDeAdicionais.T1);
    } else {
      return salario + (salario * TabelaDeAdicionais.T2);
    }
  }

  public Tecnico(String code, String nome, double salario, NivelFuncionario nivel, FuncaoFuncionarioTecnico funcao) {
    this.codigo = code;
    this.nome = nome;
    this.salario = salario;
    this.nivel = nivel;
    this.funcao = funcao;
  }
}
