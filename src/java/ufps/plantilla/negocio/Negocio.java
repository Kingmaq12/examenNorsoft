/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.ufps.plantilla.negocio;

import java.util.ArrayList;
import java.ufps.plantilla.dao.usuarioDAO;
import java.ufps.plantilla.dto.usuarioDTO;

/**
 *
 * @author CESAR
 */


public class Negocio {
    
    
    public boolean login(String user, String password){
        
        usuarioDTO dto = new usuarioDTO(user, password);
        usuarioDAO dao = new usuarioDAO();
        
        return dao.login(dto);
    }
   
}
