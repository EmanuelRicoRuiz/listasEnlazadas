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
public class ListaLCD {
    NodoLCD primero, ultimo;
    
    public ListaLCD(){
        primero=null;
        ultimo=null;
    }
    public void insertar(int dato){
        NodoLCD nuevo=new NodoLCD();
        nuevo.dato=dato;
        if (primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
        }else{
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
        }
    }
    public void mostrarLista(){
        NodoLCD actual;
        actual=primero;
        String cadena="";
        do{
            cadena+="["+actual.dato+"]";
            actual=actual.siguiente;
        }while(actual!=primero);
        System.out.println(cadena);
    }
    public int search(int num){
        NodoLCD actual;
        actual=primero;
        int indice=0;
        int pos=-1;
        do{
            if(actual.dato==num){
                pos=indice;
            }
            actual=actual.siguiente;
            indice+=1;
        }while(actual!=primero);
        return pos;
    }
    public void orderedDesc(){
        int numMin=Integer.MIN_VALUE;
        NodoLCD actual;
        actual=primero;
        NodoLCD actualAux;
        actualAux=primero;
        
    }
    public static void main(String[] args) {
        ListaLCD lista4=new ListaLCD();
        lista4.insertar(10);
        lista4.insertar(20);
        lista4.insertar(30);
        lista4.mostrarLista();
        int indice=lista4.search(30);
        if(indice<0){
            System.out.println("el numero no se encuentra en la lista");
        }else{
            System.out.println("el numero se encuentra en la posición "+indice+" de la lista");
        }
        
        
    }
    
}
