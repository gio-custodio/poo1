package com.poo1.modelo;

import java.util.ArrayList;

public class Universidade {
  public String nome;
  public ArrayList<Departamento> departamentos;

  public Universidade(String nome) {
    this.nome = nome;
    this.departamentos = new ArrayList<>();
  }

  public Departamento getDepartamentoPorCodigo(String codigo) {
    for (Departamento d : departamentos) {
      if (d.codigo.equals(codigo)) {
        return d;
      }
    }

    return null;
  }

  public Funcionario getFuncionarioPorCodigo(String codigo) {
    for (Departamento d : departamentos) {
      for (Funcionario f : d.getFuncionarios()) {
        if (f.codigo.equals(codigo)) {
          return f;
        }
      }
    }

    return null;
  }

  public Funcionario getFuncionarioPorNome(String nome) {
    for (Departamento d : departamentos) {
      for (Funcionario f : d.getFuncionarios()) {
        if (f.nome.equals(nome)) {
          return f;
        }
      }
    }

    return null;
  }
}
