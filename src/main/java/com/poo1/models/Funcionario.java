package com.poo1.models;

public abstract class Funcionario {
    public String code;
    public String nome;
    public double salario;
    public NivelFuncionario nivel;

    public enum NivelFuncionario {
        T1, T2, D1, D2, D3, S1, S2
    }

    abstract double calcularSalario();
}
