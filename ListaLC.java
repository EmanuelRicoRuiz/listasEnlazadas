/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasenlazadas;

public class ListaLC {

    NodoLC  ultimo;
    int tamaño;
    public ListaLC(){
        ultimo=null;
    }
    public boolean estVacia1(){
        return ultimo==null;
    }
    public ListaLC insertar(int elemento){
        NodoLC nuevo =new NodoLC(elemento);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        tamaño+=1;
        return this;
    }
    public int tamañoLista(){
        return tamaño;
    }
    public void mostrarLista(){
        NodoLC auxiliar=ultimo.siguiente;
        String cadena="";
        do{
            cadena+="["+auxiliar.dato+"]";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        System.out.println(cadena);
    }
    public void deleteFirst(){
       NodoLC actual;
       actual=ultimo;
       NodoLC auxiliar=actual.siguiente;
       if (ultimo==ultimo.siguiente){
           ultimo=null;
       }else{
           if (auxiliar==ultimo){
               ultimo=actual;
           }
           actual.siguiente=auxiliar.siguiente;
       }
       
    }
    public int datosLista(int indice){
        NodoLC auxiliar=ultimo.siguiente;
        int i=0;
        while(i<indice){
            auxiliar=auxiliar.siguiente;
            i+=1;
        }
        return auxiliar.dato;
    }
    public static void main(String[] args) {
        ListaLC lista2=new ListaLC();
        lista2.insertar(30);
        lista2.insertar(40);
        lista2.insertar(50);
        lista2.insertar(60);
        lista2.insertar(70);
        lista2.deleteFirst();
        lista2.mostrarLista();
        ListaLC lista3=new ListaLC();
        lista3.insertar(80);
        lista3.insertar(90);
        lista3.insertar(100);
        for (int i=0; i<lista3.tamañoLista(); i++){
            lista2.insertar(lista3.datosLista(i));
        }
        lista2.mostrarLista();
    }
    
}
 