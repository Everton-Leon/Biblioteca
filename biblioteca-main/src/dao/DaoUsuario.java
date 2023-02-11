/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
/**
 *
 * @author IFG
 */
public class DaoUsuario {
    Connection con =null;
    PreparedStatement pstm = null;
    
    
    public void criarUsuarioPadrao()
    {
        con = new Conexao().conectarBanco();
        try{
        pstm = con.prepareStatement("INSERT INTO usuario(nome,senha,email) VALUES ('Admin','admin','admin@hotmail.com')");
        pstm.execute();
        pstm.close();
        }catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o usuário padrão" +erro);
        }
    }
    
    
    public List<Usuario> getUsuarios()
    {
         con = new Conexao().conectarBanco();
         List<Usuario> lista = new ArrayList<Usuario>();
         
          try{
        pstm = con.prepareStatement("SELECT * FROM usuario", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = pstm.executeQuery();
        if(rs.first())
        {
            do{
                Usuario x = new Usuario();
                x.id = rs.getInt("id");
                x.nome = rs.getString("nome");
                x.senha = rs.getString("senha");
                x.email = rs.getString("email");
                
                lista.add(x);
                
            }while(rs.next());
        }
      
        pstm.close();
        }catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o usuário padrão" +erro);
        }
        return lista;
    } 
    
    
     public boolean verificarLogin(String nome, String senha)
    {
         boolean resposta = false;
         con = new Conexao().conectarBanco();
        
         
          try{
        pstm = con.prepareStatement("SELECT * FROM usuario WHERE nome=? and senha=?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        pstm.setString(1, nome);
        pstm.setString(2, senha);
        ResultSet rs = pstm.executeQuery();
        if(rs.first())
        {
          resposta = true;
        }
      
        pstm.close();
        }catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Erro ao inserir o usuário padrão" +erro);
        }
        return resposta;
    } 
}
