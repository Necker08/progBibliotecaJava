/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.sismed.bean;
import java.util.ArrayList;

/**
 *
 * @author ALEXANDRE NECHER DONNER ALUNO DE SISTEMAS DE INFORMAÇÃO IFPR CAMPUS PALMAS 
 */
public class Livros {
    private int IdLivro;
    private String DescricaoLivro;
    private String EdicaoLivro;
    private String AutorLivro;
    private String EditoraLivro;
    private String Quantidade;

    public int getIdLivro() {
        return IdLivro;
    }

    public void setIdLivro(int IdLivro) {
        this.IdLivro = IdLivro;
    }

    public String getDescricaoLivro() {
        return DescricaoLivro;
    }

    public void setDescricaoLivro(String DescricaoLivro) {
        this.DescricaoLivro = DescricaoLivro;
    }

    public String getEdicaoLivro() {
        return EdicaoLivro;
    }

    public void setEdicaoLivro(String EdicaoLivro) {
        this.EdicaoLivro = EdicaoLivro;
    }

    public String getAutorLivro() {
        return AutorLivro;
    }

    public void setAutorLivro(String AutorLivro) {
        this.AutorLivro = AutorLivro;
    }

    public String getEditoraLivro() {
        return EditoraLivro;
    }

    public void setEditoraLivro(String EditoraLivro) {
        this.EditoraLivro = EditoraLivro;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    @Override
    public String toString() {
        return this.DescricaoLivro; 
        
    }
    
    
}
