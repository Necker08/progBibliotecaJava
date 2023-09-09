/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.sismed.dao;

import br.edu.ifpr.bsi.sismed.bean.Livros;
import br.edu.ifpr.bsi.sismed.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALEXANDRE NECHER DONNER ALUNO DE SISTEMAS DE INFORMAÇÃO IFPR CAMPUS PALMAS 
 */
public class LivrosDao {
    
     public static void inserir (Livros livros) throws SQLException{
    
         Connection con = (Connection) Conexao.getConexao();
         
         String sql = "insert into livros (descricao_livro, edicao_livro,autor_livro,editora_livro,quantidade)"
                + "values (?,?,?,?,?)";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, livros.getDescricaoLivro());
        stmt.setString(2, livros.getEdicaoLivro());
        stmt.setString(3, livros.getAutorLivro());
        stmt.setString(4, livros.getEditoraLivro());
        stmt.setString(5, livros.getQuantidade());

        stmt.execute();
        stmt.close();

        con.close();
         
     }
     
      public static void editar(Livros livros) throws SQLException {

        Connection con = Conexao.getConexao();

        String sql = "update livros set descricao_livro=?, "
                + "edicao_livro = ?, autor_livro, editora_livro, quantidade where id_livro=?";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setString(1, livros.getDescricaoLivro());
        stmt.setString(2, livros.getEdicaoLivro());
        stmt.setString(3, livros.getAutorLivro());
        stmt.setString(4, livros.getEditoraLivro());
        stmt.setString(5, livros.getQuantidade());

        stmt.executeUpdate();
        stmt.close();

        con.close();
    }
      
      public static void excluir(Livros livros) throws SQLException {

        Connection con = Conexao.getConexao();

        String sql = "delete from livros where id_livro = ? ";

        PreparedStatement stmt = con.prepareStatement(sql);

        stmt.setInt(1, livros.getIdLivro());

        stmt.executeUpdate();
        stmt.close();

        con.close();
    }
      
      public static List<Livros> pesquisar(Livros livrosPesq) throws SQLException {
   
        List<Livros> livros = new ArrayList<Livros>();
        Connection con = Conexao.getConexao();
        
        String sql = "select * from livros where descricao_livro like '" + livrosPesq.getDescricaoLivro()+ "%' order by descricao_livro";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Livros livro = new Livros();
            livro.setIdLivro(rs.getInt("id_livro"));
            livro.setDescricaoLivro(rs.getString("descricao_livro"));
            livro.setEdicaoLivro(rs.getString("edicao_livro"));
            livro.setAutorLivro(rs.getString("autor_livro"));
            livro.setEditoraLivro(rs.getString("editora_livro"));
            livro.setQuantidade(rs.getString("quantidade"));
            livros.add( livro);
        }
        stmt.close();
        rs.close();
        con.close();
        return livros;
    }
      
       public static List<Livros> listar() throws SQLException {
        // criação de uma lista de estados
        //List é uma interface, ArrayList implemeta essa interface 
        List<Livros> livross = new ArrayList<Livros>();
        Connection con = Conexao.getConexao();
        
        String sql = "select * from livros order by id_livro";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        //Result set rrecebe o resultado da seleção realizada acima.
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Livros livro = new Livros();
            livro.setIdLivro(rs.getInt("id_livro"));
            livro.setDescricaoLivro(rs.getString("descricao_livro"));
            livro.setEdicaoLivro(rs.getString("edicao_livro"));
            livro.setAutorLivro(rs.getString("autor_livro"));
            livro.setEditoraLivro(rs.getString("editora_livro"));
            livro.setQuantidade(rs.getString("quantidade"));
            livross.add( livro);
        }
        stmt.close();
        rs.close();
        con.close();
        return livross;
    }
    
    

}
