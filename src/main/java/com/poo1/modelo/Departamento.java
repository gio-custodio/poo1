package com.poo1.modelo;

import java.util.ArrayList;

public class Departamento {
  public String codigo;
  public String nome;
  public ArrayList<DocenteEfetivo> docentesEfetivos;
  public ArrayList<DocenteSubstituto> docentesSubstitutos;
  public ArrayList<Tecnico> tecnicos;

  public Departamento(String codigo, String nome) {
    this.codigo = codigo;
    this.nome = nome;
    this.docentesEfetivos = new ArrayList<>();
    this.docentesSubstitutos = new ArrayList<>();
    this.tecnicos = new ArrayList<>();
  }

  public ArrayList<Funcionario> getFuncionarios() {
    ArrayList<Funcionario> f = new ArrayList<>();

    for (Funcionario de : docentesEfetivos) {
      f.add(de);
    }

    for (Funcionario ds : docentesSubstitutos) {
      f.add(ds);
    }

    for (Funcionario t : tecnicos) {
      f.add(t);
    }

    return f;
  }

  public ArrayList<Docente> getDocentes() {
    ArrayList<Docente> d = new ArrayList<>();

    for (DocenteEfetivo de : docentesEfetivos) {
      d.add(de);
    }

    for (DocenteSubstituto ds : docentesSubstitutos) {
      d.add(ds);
    }

    return d;
  }

  public double getGastosFuncionarios() {
    double valor = 0.0;

    for (DocenteEfetivo de : docentesEfetivos) {
      valor += de.calcularSalario();
    }

    for (DocenteSubstituto ds : docentesSubstitutos) {
      valor += ds.calcularSalario();
    }

    for (Tecnico t : tecnicos) {
      valor += t.calcularSalario();
    }

    return valor;
  }
}
