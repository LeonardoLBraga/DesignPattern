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
public class TocarNoCelular implements ModoDeTocarMusica{

    @Override
    public void tocar() {
        System.out.println("Tocando no celular");
    }
    
}
