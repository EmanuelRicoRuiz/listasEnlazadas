/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

/**
 *
 * @author hp
 */
public class NodoLC {
    int dato;
    NodoLC siguiente;
    public NodoLC(int d){
        dato=d;
        siguiente=this;
    }
}
