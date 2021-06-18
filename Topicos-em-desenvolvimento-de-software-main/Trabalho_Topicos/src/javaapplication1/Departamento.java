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
public class Departamento { //class para Departamento -- com gets e sets
    String Nome_depart, Telefone_sala;
    int Codigo, Numero_sala;

    public Departamento(){
        
    }
    
    public Departamento(String Nome_depart, int Codigo, int Numero_sala, String Telefone_sala) {
            this.Nome_depart = Nome_depart;
            this.Codigo = Codigo;
            this.Numero_sala = Numero_sala;
            this.Telefone_sala = Telefone_sala;
    }
    
    
    public String getNome_depart() {
        return Nome_depart;
    }

    public void setNome_depart(String Nome_depart) {
        this.Nome_depart = Nome_depart;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getNumero_sala() {
        return Numero_sala;
    }

    public void setNumero_sala(int Numero_sala) {
        this.Numero_sala = Numero_sala;
    }

    public String getTelefone_sala() {
        return Telefone_sala;
    }

    public void setTelefone_sala(String Telefone_sala) {
        this.Telefone_sala = Telefone_sala;
    }

    
}
