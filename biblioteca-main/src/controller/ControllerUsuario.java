/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoUsuario;
import java.util.List;
import model.Usuario;

/**
 *
 * @author IFG
 */
public class ControllerUsuario {
    DaoUsuario dao = new DaoUsuario();
   
    
    public List<Usuario> retornaUsuarios()
    {
        return dao.getUsuarios();
    }
    
    public void usuarioPadrao()
    {
        dao.criarUsuarioPadrao();
    }
    public boolean validarLogin(String n, String s)
    {
        return dao.verificarLogin(n, s);
    }
}
