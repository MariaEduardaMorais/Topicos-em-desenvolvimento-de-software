/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author Maria Eduarda e Lorena Eduarda
 */
public class Historico { //class para Historico -- com gets e sets
    private ArrayList<Integer> Notas_Numericas = new ArrayList<Integer>();
    private ArrayList<Disciplina> disc = new ArrayList<Disciplina>();
    private ArrayList<String> Conceito = new ArrayList<String>();
    private Aluno Alunos;
    
    
    
    public Historico(){
        
    }
    
    public Historico(Aluno Alunos, Disciplina disc, String Conceito, int Notas_Numericas){
        this.Alunos = Alunos;
        this.disc.add(disc);
        this.Conceito.add(Conceito);
        this.Notas_Numericas.add(Notas_Numericas);
    }
    
    public void adicionarDisciplina(Disciplina Disciplinas){
        this.disc.add(Disciplinas);
    }
    
    public void adicionarConceito(String Conceito){
        this.Conceito.add(Conceito);
    }
    
    public void adicionarNotas_Numericas(int Notas_Numericas){
        this.Notas_Numericas.add(Notas_Numericas);
    }
    
    int posicao;
    public void removerDisciplina(Disciplina Disciplina){
        this.disc.remove(Disciplina);
        posicao = this.disc.indexOf(Disciplina);
    }
    
    public void removerConceito(){
        this.Conceito.remove(posicao);
    }
    
    public void removerNotaNumerica(){
        this.Notas_Numericas.remove(posicao);
    }    

    public Aluno getAlunos() {
        return Alunos;
    }

    public void setAlunos(Aluno Alunos) {
        this.Alunos = Alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disc;
    }

    public void setDisciplinas(int posicao, Disciplina Disciplina) {
        this.disc.set(posicao, Disciplina);
    }

    public ArrayList<String> getConceito() {
        return Conceito;
    }

    public void setConceito(int posicao, String Conceito) {
        this.Conceito.set(posicao, Conceito);
    }

    public ArrayList<Integer> getNotas_Numericas() {
        return Notas_Numericas;
    }

    public void setNotas_Numericas(int posicao, int Notas_Numericas) {
        this.Notas_Numericas.set(posicao, Notas_Numericas);
    }

    public void adicionarNotaNumerica(int i) {
        this.Alunos = Alunos;
        
    }

    public Object getAluno() {
        
        return null;
        
    }

    public Object getDisciplina() {
        
        return null;
        
    }

    public void setNotas_Numuericas(int posicao, int nota) {
        this.posicao = posicao;
        this.Notas_Numericas = Notas_Numericas;
        
    }

    
}
