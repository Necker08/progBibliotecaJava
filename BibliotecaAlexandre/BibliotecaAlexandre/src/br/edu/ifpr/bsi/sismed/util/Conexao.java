/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.bsi.sismed.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author ALEXANDRE NECHER DONNER ALUNO DE SISTEMAS DE INFORMAÇÃO IFPR CAMPUS PALMAS 
 */
public class Conexao {
    
      public static Connection getConexao() throws SQLException{
       try{
        //definição do driver de conexão
        Class.forName("com.mysql.cj.jdbc.Driver");
        //definição dos  parametros de conexão
        return DriverManager.getConnection("jdbc:mysql://localhost/biblioteca_alexandre?useTimezone=true&serverTimezone=UTC", "root","conputador321");
    }catch (ClassNotFoundException e){
        throw new SQLDataException(e.getMessage()); 
      }
    }
       public static void main(String[] args) {
        try{
           getConexao();
           System.out.println("Conexão realizada com sucesso.");
        }catch (SQLException e){
            System.out.println("Conexão não realizada, verificar log.");
            e.printStackTrace();
        }    
    }
}


    

