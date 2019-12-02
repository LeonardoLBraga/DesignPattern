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
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ModoDeTocarMusicaFactory mf = new ModoDeTocarMusicaFactory();      
      Pessoa p = new Pessoa();
      
      p.setModoDeTocarMusica(mf.chamaModoDeTocar("radio"));
      p.tocar();
    }
    
}
