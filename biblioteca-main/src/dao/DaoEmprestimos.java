
package dao;

import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Emprestimos;

public class DaoEmprestimos {
    Connection con =null;
    PreparedStatement pstm = null;
    
    public void registrarEmprestimo(Emprestimos emt)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("INSERT INTO emprestimos(nome,nCadastro,codLivro,titulo,dataEmpre,dataDevo) VALUES (?,?,?,?,?,?)");
        pstm.setString(1, emt.nome);
        pstm.setInt(2, emt.nCadastro);
        pstm.setInt(3, emt.codLivro);
        pstm.setString(4, emt.titulo);
        pstm.setString(5, emt.dataEmpre);
        pstm.setString(6, emt.dataDevo);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Empréstimo registrado");
        
    }   
    catch(SQLException errocad)
    {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar informações do empréstimo no Banco de Dados. Tente novamente mais tarde."+errocad);
    }
}


public void alterarEmprestimo(Emprestimos emt)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("UPDATE emprestimos SET nome=?,nCadastro=?,codLivro=?,titulo=?,dataEmpre=?,dataDevo=? WHERE idEmprestimo=?");
        pstm.setString(1, emt.nome);
        pstm.setInt(2, emt.nCadastro);
        pstm.setInt(3, emt.codLivro);
        pstm.setString(4, emt.titulo);
        pstm.setString(5, emt.dataEmpre);
        pstm.setString(6, emt.dataDevo);
        pstm.setInt(7,emt.idEmprestimo);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Informações do empréstimos alteradas com êxito");
        
    }   
    catch(SQLException erralt)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar informações do empréstimo no Banco de Dados "+erralt);
    }
}

 public void excluirEmprestimo(int idEmprestimo)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("DELETE FROM emprestimos WHERE idEmprestimo = ?");
        pstm.setInt(1, idEmprestimo);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O empréstimo selecionado foi deletado do sistema");
        
    }   
    catch(SQLException errexc)
    {
        JOptionPane.showMessageDialog(null, "Erro ao excluir as informações do empréstimo. Tente novamente mais tarde "+errexc);
    }
}
public List<Emprestimos> getEmprestimos()
 {
     List<Emprestimos> lista = new ArrayList<Emprestimos>();
     con = new Conexao().conectarBanco();
     try{
     pstm = con.prepareStatement("SELECT * FROM emprestimos",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     ResultSet rs = pstm.executeQuery();
     if(rs.first())
     {
         do{
            Emprestimos ep = new Emprestimos();
            ep.idEmprestimo = rs.getInt("idEmprestimo");
            ep.nome = rs.getString("nome");
            ep.nCadastro = rs.getInt("nCadastro");
            ep.codLivro = rs.getInt("codLivro");
            ep.titulo = rs.getString("titulo");
            ep.dataEmpre = rs.getString("dataEmpre");
            ep.dataDevo = rs.getString("dataDevo");
         
            lista.add(ep);
         }while(rs.next());
     }
     pstm.close();
     }catch(SQLException erro)
     {
         JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela empréstimos: "+erro);
     }
     return lista;
 }

 
}