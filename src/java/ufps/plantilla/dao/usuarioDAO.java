/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.ufps.plantilla.dao;

import java.ufps.plantilla.dto.usuarioDTO;
import java.ufps.plantilla.interf.IUsuarioDAO;

/**
 *
 * @author CESAR
 */
public class usuarioDAO implements IUsuarioDAO{
    
    
    public boolean login(usuarioDTO dto){
        
        if(dto.getUser().equalsIgnoreCase("user")&& dto.getPassword().equalsIgnoreCase("12345")){
          return true;
        }
        return false;
    }
    
   
    
}
