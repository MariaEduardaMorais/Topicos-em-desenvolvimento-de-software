/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author Maria Eduarda e Lorena Eduarda
 */
public class Aluno { //class para Aluno -- com gets e sets
    private String Nome, CPF, Endereco, Telefone, Turma, Programa, dataNascimento; 
    private char Sexo;
    private Departamento d1, d2;
    private int numMatricula;
    

    
  
    public Aluno (){
        
    }
    
    
    public Aluno(String Nome, String CPF, String Endereco, String Telefone, String Turma, String Programa, int numMatricula, String dataNascimento, char Sexo, Departamento d1, Departamento d2){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Turma = Turma;
        this.Programa = Programa;
        this.Sexo = Sexo;
        this.numMatricula = numMatricula;
        this.dataNascimento = dataNascimento;
        this.d1 = d1;
        this.d2 = d2;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public String getPrograma() {
        return Programa;
    }

    public void setPrograma(String programa) {
        this.Programa = programa;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public Departamento getd1() {
        return d1;
    }

    public void setDepPrincipal(Departamento d1) {
        this.d1 = d1;
    }

    public Departamento getd2() {
        return d2;
    }

    public void setDepartSecundario(Departamento d2) {
        this.d2 = d2;
    }
}