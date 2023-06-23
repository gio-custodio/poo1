package com.poo1.modelo;

public class DocenteSubstituto extends Docente {
  public CargaHorariaDocenteSubstituto cargaHoraria;

  public enum CargaHorariaDocenteSubstituto {
    Completo(24), Metade(12);

    private CargaHorariaDocenteSubstituto(int carga) {
      this.carga = carga;
    }

    private int carga;

    public int getCarga() {
      return carga;
    }

    public void setCarga(int carga) {
      this.carga = carga;
    }
  }

  @Override
  public double calcularSalario() {
    if (nivel.equals(NivelFuncionario.S1)) {
      return salario + (salario * TabelaDeAdicionais.S1);
    } else {
      return salario + (salario * TabelaDeAdicionais.S2);
    }
  }

  public DocenteSubstituto(
      String code,
      String nome,
      double salario,
      NivelFuncionario nivel,
      TitulacaoDocente titulacao,
      CargaHorariaDocenteSubstituto cargaHoraria) {
    this.codigo = code;
    this.nome = nome;
    this.salario = salario;
    this.nivel = nivel;
    this.titulacao = titulacao;
    this.cargaHoraria = cargaHoraria;
  }
}
