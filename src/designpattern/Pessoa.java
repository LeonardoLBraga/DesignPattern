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
public class Pessoa {
    private ModoDeTocarMusica modoDeTocarMusica;

    public void setModoDeTocarMusica(ModoDeTocarMusica modoDeTocarMusica) {
        this.modoDeTocarMusica = modoDeTocarMusica;
    }
    public void tocar(){
        this.modoDeTocarMusica.tocar();
    }
    
}
