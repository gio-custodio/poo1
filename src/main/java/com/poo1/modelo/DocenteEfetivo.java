package com.poo1.modelo;

public class DocenteEfetivo extends Docente {
  public AreaDocenteEfetivo area;

  public enum AreaDocenteEfetivo {
    Biológicas, Exatas, Humanas, Saúde
  }

  @Override
  public double calcularSalario() {
    if (nivel.equals(NivelFuncionario.D1)) {
      return salario + (salario * TabelaDeAdicionais.D1);
    } else if (nivel.equals(NivelFuncionario.D2)) {
      return salario + (salario * TabelaDeAdicionais.D2);
    } else {
      return salario + (salario * TabelaDeAdicionais.D3);
    }
  }

  public DocenteEfetivo(
      String code,
      String nome,
      double salario,
      NivelFuncionario nivel,
      TitulacaoDocente titulacao,
      AreaDocenteEfetivo area) {
    this.codigo = code;
    this.nome = nome;
    this.salario = salario;
    this.nivel = nivel;
    this.titulacao = titulacao;
    this.area = area;
  }
}
