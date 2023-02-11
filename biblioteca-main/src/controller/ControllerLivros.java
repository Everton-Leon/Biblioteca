
package controller;

import dao.DaoLivros;
import java.util.List;
import model.Livros;

public class ControllerLivros {
    DaoLivros dao = new DaoLivros();
    
    public List<Livros> retornaLivros()
    {
        return dao.getLivros();
    }
    
    public void guardarLivro(Livros lv)
    {
        dao.salvarLivro(lv);
    }
    
    public void atualizarLivro(Livros lv)
    {
        dao.alterarLivro(lv);
    }
}
