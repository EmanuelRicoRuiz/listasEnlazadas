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
public class MainDobles {

    private NodoDoble inicio, fin;
    public MainDobles(){
        inicio=fin=null;
        
    }
    public boolean estVacia(){
        return inicio==null;
    }
    public void addOrdered(int dato){
        if(!estVacia()){
            fin=new NodoDoble(dato, null, fin);
            fin.anterior.siguiente=fin;
                    
        }else{
            inicio=fin=new NodoDoble(dato);
        }
    }
    public void mostrarLista(){
        if(!estVacia()){
            String datos="<=>";
            NodoDoble auxiliar=inicio;
            while(auxiliar!=null){
                datos+="["+auxiliar.dato+"]<=>";
                auxiliar=auxiliar.siguiente;
            }
            System.out.println(datos);
        }
    }
    public void delete(int elemento) {
        NodoDoble temp = inicio;
        if (inicio == fin && temp.dato == elemento) {
            inicio = fin = null;
        }else{
        if (!estVacia()) {

            while (temp != null && temp.dato != elemento) {
                temp = temp.siguiente;
            }
        }

        if (temp != null) {
            if (temp != inicio) {
                if (temp != fin) {
                    temp.siguiente.anterior = temp.anterior;
                    temp.anterior.siguiente = temp.siguiente;
                } else {//eliminar  del final
                    fin = fin.anterior;
                    fin.siguiente = null;
                }
            } else {//eliminar del inicial
                inicio = inicio.siguiente;
                inicio.anterior = null;
            }
        }
        }
        
    }

    public static void main(String[] args) {
        MainDobles lista1=new MainDobles();
        lista1.addOrdered(30);
        lista1.addOrdered(40);
        lista1.addOrdered(50);
        lista1.addOrdered(60);
        lista1.addOrdered(70);
        lista1.delete(40);
        lista1.mostrarLista();
    }
    
}
