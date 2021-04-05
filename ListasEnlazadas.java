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
public class ListasEnlazadas {

    private Nodo primero;
    private Nodo ultimo;
    private int tamano;

    public ListasEnlazadas() {
        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;
    }
    public void addLast(int dato) {
        if(this.primero==null) {
            Nodo nuevo = new Nodo(dato);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo;
        }
        else {
            Nodo nuevo = new Nodo(dato);
            nuevo.siguiente = null;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        this.tamano++;
        
    }

//Metodo para borrar al final de la lista.
    public void deleteLast() {
        Nodo eliminar = null;
        if(this.primero==null) {
            
        }
        if(primero == ultimo) {
            primero = null;
            ultimo = null;
        }
        else {
            Nodo actual = primero;
            while(actual.siguiente != ultimo) {
                actual = actual.siguiente;
            }
            eliminar = actual.siguiente;
            actual.siguiente = null;

            ultimo = actual;
        }
        this.tamano--;
     
    }

    public void imprimir() {
        if(tamano != 0) {
            Nodo temp = primero;
            String str = "";
            for(int i = 0; i < this.tamano; i++) {
                str = str + temp.dato + "\n";
                
                temp = temp.siguiente;
            }
            System.out.println(str);
            
        }
    }
    public void addAfter(int num, int dato) {
        Nodo nuevo = new Nodo(dato);
        Nodo actual;
        actual=primero;
        int cont=0;
        int n=-1;
        while(actual!=null){
                if(actual.dato==num){
                    n=cont;
                }
                cont+=1;
                actual=actual.siguiente;
            }
        if(n>0){
           if (primero == null) {
            primero = nuevo;
        } else {
            Nodo puntero = primero;
            int contador = 0;
            while (contador < n && puntero.siguiente != null) {
                puntero = puntero.siguiente;
                contador++;
            }
            
            nuevo.siguiente = puntero.siguiente;
            puntero.siguiente = nuevo;
        }
        tamano++; 
        }else{
            System.out.println("el dato no existe");
        }
        
    }
    public void cantidadDatos(){
        System.out.println("el tamaño de la lista es de: "+tamano);
    }

    public static void main(String[] args) {
        ListasEnlazadas lista=new ListasEnlazadas();
        lista.addLast(20);
        lista.addLast(30);
        lista.addLast(40);
        lista.addLast(50);
        lista.deleteLast();
        lista.addAfter(30, 25);
        lista.imprimir();
        lista.cantidadDatos();
    }
    
}
