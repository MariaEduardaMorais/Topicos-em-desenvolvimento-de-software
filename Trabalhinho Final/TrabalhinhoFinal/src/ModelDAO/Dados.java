/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

/**
 *
 * @author Cliente
 */
public class Dados {
    private int codigo_de_cadastro, telefone;
    private String nome, endereço;


    public int getcodigo_de_cadastro() {
        return codigo_de_cadastro;
    }

    public void setcodigo_de_cadastro(int codigo_de_cadastro) {
        this.codigo_de_cadastro = codigo_de_cadastro;
    }

    public int gettelefone() {
        return telefone;
    }

    public void settelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getendereço() {
        return endereço;
    }

    public void setendereço(String endereço) {
        this.endereço = endereço;
    }
}
