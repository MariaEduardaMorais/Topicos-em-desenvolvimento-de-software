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
public class Curso { //class para Curso -- com gets e sets
    String Nome_curso, Descricao;
    int Numero_curso, Horas_sem, Nivel;
    String DepResponsavel;
    
    public Curso(){
        
    }
    
    public Curso(String Nome_curso, String Descricao, int Numero_curso, int Horas_sem, int Nivel){
        this.Nome_curso = Nome_curso;
        this.Descricao = Descricao;
        this.Numero_curso = Numero_curso;
        this.Horas_sem = Horas_sem;
        this.Nivel = Nivel;
    }
    
    public Curso(String Nome_curso, String Descricao, int Numero_curso, int Horas_sem, int Nivel, String DepResponsavel){
        this.Nome_curso = Nome_curso;
        this.Descricao = Descricao;
        this.Numero_curso = Numero_curso;
        this.Horas_sem = Horas_sem;
        this.Nivel = Nivel;
        this.DepResponsavel = DepResponsavel;
    }

    public Curso(String curso_Tecnico_em_Informatica, String curso_tecino_integrado_de_Informatica, int i, int i0, int i1, Departamento d1) {
        
    }

    

    public String getNome_curso() {
        return Nome_curso;
    }

    public void setNome(String nome) {
        this.Nome_curso = Nome_curso;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public int getNumero_curso() {
        return Numero_curso;
    }

    public void setNumero_curso(int Numero_curso) {
        this.Numero_curso = Numero_curso;
    }

    public int getHoras_sem() {
        return Horas_sem;
    }

    public void setHoras_sem(int Horas_sem) {
        this.Horas_sem = Horas_sem;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int Nivel) {
        this.Nivel = Nivel;
    }

    public String getDepResponsavel() {
        return DepResponsavel;
    }

    public void setDepartResponsavel(String DepResponsavel) {
        this.DepResponsavel = DepResponsavel;
    }

    public Object getNome(String Nome_curso) {
        this.Nome_curso = Nome_curso;
        return null;
    }

    public Object getNome() {

        return Nome_curso;
    }
}


    