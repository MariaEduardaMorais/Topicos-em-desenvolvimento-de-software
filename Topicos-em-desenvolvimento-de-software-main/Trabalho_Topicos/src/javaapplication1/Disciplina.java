package javaapplication1;

import java.util.ArrayList;


/**
 *
 * @author Maria Eduarda e Lorena Eduarda
 */
public class Disciplina { //class para Disciplina -- com gets e sets
    String Nome_disciplina,  Nome_professor;
    Curso curso;
    int Ano, Semestre, Numero;
    
    
    public Disciplina(){
        
    }
    

    public Disciplina(String Nome_disciplina, String Nome_professor, int Semestre, int Ano, int Numero, Curso curso) {
        this.Nome_disciplina = Nome_disciplina;
        this.Nome_professor = Nome_professor;
        this.Semestre = Semestre;
        this.Ano = Ano;
        this.Numero = Numero;
        this.curso = curso;
    }
    
    public void setNome_disciplina(String Nome_disciplina) {
        this.Nome_disciplina = Nome_disciplina;
    }
    
    public String getNome_disciplina() {
        return Nome_disciplina;
    }
    
    public String getNome_professor() {
        return Nome_professor;
    }

    public void setNome_professor(String Nome_professor) {
        this.Nome_professor = Nome_professor;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Object getNome() {
        this.Nome_disciplina = Nome_disciplina;
        return null;
    }
    
    
}
