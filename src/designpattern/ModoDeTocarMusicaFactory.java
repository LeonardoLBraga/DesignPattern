/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author Leonardo Braga
 */
public class ModoDeTocarMusicaFactory {
    
     public ModoDeTocarMusica chamaModoDeTocar(String modoTocar){
        if(modoTocar.equalsIgnoreCase("radio")){
            return new TocarNoRadio();
        }
        else if(modoTocar.equalsIgnoreCase("fone")){
            return new TocarNoFoneDoCelular();
        }
        else if(modoTocar.equalsIgnoreCase("tv")){
            return new TocarNaTv();
        }else {
            return new TocarNoCelular();
        }
    }
}
