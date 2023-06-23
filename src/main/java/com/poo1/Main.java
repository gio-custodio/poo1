package com.poo1;

import com.poo1.modelo.Departamento;

public class Main {
  public static void main(String[] args) {
    BancoDeDados.universidade.departamentos.add(new Departamento("1", "Departamento de Matemática e Computação"));

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      System.out.println("Nome: " + d.nome);
      System.out.println("Código: " + d.codigo);
    }
  }
}
