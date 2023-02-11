package dao;
import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Livros;

public class DaoLivros {
    Connection con =null;
    PreparedStatement pstm = null;
    
    public void salvarLivro(Livros lv)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("INSERT INTO livros(titulo,ano,autor,idEditora,classificacao,estante) VALUES (?,?,?,?,?,?)");
        pstm.setString(1, lv.titulo);
        pstm.setInt(2, lv.ano);
        pstm.setString(3, lv.autor);
        pstm.setInt(4, lv.idEditora);
        pstm.setString(5, lv.classificacao);
        pstm.setString(6, lv.estante);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O livro foi salvo com êxito");
        
    }   
    catch(SQLException errocad)
    {
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro no Banco de Dados. Tente novamente mais tarde."+errocad);
    }
}
    
    public void alterarLivro(Livros lv)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("UPDATE livros SET titulo=?, ano=?,autor=?,idEditora=?,classificacao=?,estante=? WHERE cod = ?");     
        pstm.setString(1, lv.titulo);
        pstm.setInt(2, lv.ano);
        pstm.setString(3, lv.autor);
        pstm.setInt(4, lv.idEditora);
        pstm.setString(5, lv.classificacao);
        pstm.setString(6, lv.estante);
        pstm.setInt(7, lv.cod);
        
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O livro foi alterado com êxito");
        
    }   
    catch(SQLException erralt)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar informações do livro "+lv.titulo+ " no Banco de Dados "+erralt);
    }
}
    
    public void excluirLivro(int cod)
{
    con= new Conexao().conectarBanco();
    try
    {
        
        pstm = con.prepareStatement("DELETE FROM livros WHERE cod = ?");
        pstm.setInt(1, cod);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "O livro selecionado foi deletado do sistema");
        
    }   
    catch(SQLException errexc)
    {
        JOptionPane.showMessageDialog(null, "Erro ao excluir as informações do livro. Tente novamente mais tarde "+errexc);
    }
}
 
    public List<Livros> getLivros()
 {
     List<Livros> lista = new ArrayList<Livros>();
     con = new Conexao().conectarBanco();
     try{
     pstm = con.prepareStatement("SELECT * FROM livros",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
     ResultSet rs = pstm.executeQuery();
     if(rs.first())
     {
         do{
            Livros livro = new Livros();
            livro.cod = rs.getInt("cod");
            livro.titulo = rs.getString("titulo");
            livro.ano = rs.getInt("ano");
            livro.autor = rs.getString("autor");
            livro.idEditora = rs.getInt("idEditora");
            livro.estante = rs.getString("estante");
            livro.classificacao = rs.getString("classificacao");
            
         
            lista.add(livro);
         }while(rs.next());
     }
     pstm.close();
     }catch(SQLException erro)
     {
         JOptionPane.showMessageDialog(null, "Erro ao buscar dados da tabela livros: "+erro);
     }
     return lista;
 }
    

}
