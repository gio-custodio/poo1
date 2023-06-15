package com.poo1.models;

public abstract class Docente extends Funcionario {
    public TitulacaoDocente titulacao;
    
    public enum TitulacaoDocente {
        Graduação, Mestrado, Doutorado, LivreDocente, Titular
    }
}
