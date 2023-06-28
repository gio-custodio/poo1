package com.poo1.controlador;

import java.util.ArrayList;

import com.poo1.BancoDeDados;

import com.poo1.modelo.Departamento;
import com.poo1.modelo.Docente;
import com.poo1.modelo.Docente.TitulacaoDocente;

import com.poo1.modelo.Funcionario;
import com.poo1.modelo.Funcionario.NivelFuncionario;

import com.poo1.modelo.DocenteEfetivo;
import com.poo1.modelo.DocenteEfetivo.AreaDocenteEfetivo;

import com.poo1.modelo.DocenteSubstituto;
import com.poo1.modelo.DocenteSubstituto.CargaHorariaDocenteSubstituto;

import com.poo1.modelo.Tecnico;
import com.poo1.modelo.Tecnico.FuncaoFuncionarioTecnico;

public class Controlador {
  public void adicionarDepartamento(String codigo, String nome) {
    BancoDeDados.universidade.departamentos.add(new Departamento(codigo, nome));
  }

  public void adicionarDocenteEfetivoFuncionario(
      String departamentoCodigo,
      String code,
      String nome,
      double salario,
      NivelFuncionario nivel,
      TitulacaoDocente titulacao,
      AreaDocenteEfetivo area) {
    Departamento d = BancoDeDados.universidade.getDepartamentoPorCodigo(departamentoCodigo);

    if (d == null)
      return;

    d.docentesEfetivos.add(new DocenteEfetivo(code, nome, salario, nivel, titulacao, area));
  }

  public void adicionarDocenteSubstitutoFuncionario(
      String departamentoCodigo,
      String code,
      String nome,
      double salario,
      NivelFuncionario nivel,
      TitulacaoDocente titulacao,
      CargaHorariaDocenteSubstituto cargaHoraria) {
    Departamento d = BancoDeDados.universidade.getDepartamentoPorCodigo(departamentoCodigo);

    if (d == null)
      return;

    d.docentesSubstitutos.add(new DocenteSubstituto(code, nome, salario, nivel, titulacao, cargaHoraria));
  }

  public void adicionarTecnicoFuncionario(
      String departamentoCodigo,
      String code,
      String nome,
      double salario,
      NivelFuncionario nivel,
      FuncaoFuncionarioTecnico funcao) {
    Departamento d = BancoDeDados.universidade.getDepartamentoPorCodigo(departamentoCodigo);

    if (d == null)
      return;

    d.tecnicos.add(new Tecnico(code, nome, salario, nivel, funcao));
  }

  public ArrayList<Departamento> getAllDepartamentos() {
    return BancoDeDados.universidade.departamentos;
  }
  
  public Departamento getDepartamentoPorNome(String nome) {
    for (Departamento d : BancoDeDados.universidade.departamentos) {
        if (d.nome.equals(nome)) {
            return d;
        }
    }
      
    return null;
  }

  public Funcionario getFuncionarioPorCodigo(String codigo) {
    return BancoDeDados.universidade.getFuncionarioPorCodigo(codigo);
  }

  public Funcionario getFuncionarioPorNome(String nome) {
    return BancoDeDados.universidade.getFuncionarioPorNome(nome);
  }

  public ArrayList<Funcionario> getAllFuncionarios() {
    ArrayList<Funcionario> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      output.addAll(d.getFuncionarios());
    }

    return output;
  }

  public ArrayList<Tecnico> getAllTecnicos() {
    ArrayList<Tecnico> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      output.addAll(d.tecnicos);
    }

    return output;
  }

  public ArrayList<Docente> getAllDocentes() {
    ArrayList<Docente> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      output.addAll(d.getDocentes());
    }

    return output;
  }

  public ArrayList<DocenteEfetivo> getDocentesEfetivos() {
    ArrayList<DocenteEfetivo> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      output.addAll(d.docentesEfetivos);
    }

    return output;
  }

  public ArrayList<DocenteSubstituto> getDocentesSubstitutos() {
    ArrayList<DocenteSubstituto> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      output.addAll(d.docentesSubstitutos);
    }

    return output;
  }

  public ArrayList<Funcionario> getFuncionariosPorFaixaDeSalario(double minimo, double maximo) {
    ArrayList<Funcionario> output = new ArrayList<>();

    for (Departamento d : BancoDeDados.universidade.departamentos) {
      ArrayList<Funcionario> f = new ArrayList<>();

      for (Funcionario funcionario : d.getFuncionarios()) {
        if (funcionario.calcularSalario() >= minimo && funcionario.calcularSalario() <= maximo) {
            System.out.println(funcionario.nome + funcionario.calcularSalario());
          f.add(funcionario);
        }
      }

      output.addAll(f);
    }

    return output;
  }
}
