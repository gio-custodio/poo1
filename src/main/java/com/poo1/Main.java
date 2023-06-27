package com.poo1;

import com.poo1.modelo.Departamento;
import com.poo1.ui.UI;

public class Main {
  public static void main(String[] args) {
    BancoDeDados.universidade.departamentos.add(new Departamento("1", "Departamento de Matemática e Computação"));

    UI ui = new UI();
    ui.setVisible(true);
  }
}
