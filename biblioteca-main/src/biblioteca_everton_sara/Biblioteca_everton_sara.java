/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca_everton_sara;

import controller.ControllerUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import view.FrmLogin;

/**
 *
 * @author IFG
 */
public class Biblioteca_everton_sara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new Conexao().conectarBanco();
        ControllerUsuario control = new ControllerUsuario();
        List<Usuario> ver = new ArrayList<Usuario>();
        ver = control.retornaUsuarios();
        
        if(ver.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Não existe usuarios cadastrados no banco");
            control.usuarioPadrao();
        }
        
        
        new FrmLogin().setVisible(true);
    }
    
}
