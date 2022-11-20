package ejecucion;

import java.util.ArrayList;

import estructuras.*;
import kruskal.*;

public class Ejecucion {

    static void imprimirAristas(ArrayList<Arista> l){

        System.out.println("Aristas:");
        for (Arista arista : l)
            System.out.println("("+ arista.origen + " , "+ arista.destino+") = "+arista.peso);
        
    }


    public static void main(String[] args) throws Exception {

        /*
         * 
         * Inicio de sección para crear grafos y probar el algoritmo, no olvidar introducir el nombre del grafo creado en el método de kruskal
         * Se dejan 3 grafos de prueba
         * 
         */
        

        // Primer grafo de prueba

        GrafoTDA grafo = new Grafo();
        grafo.inicializarGrafo();

        
        
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);
        grafo.agregarVertice(6);
        grafo.agregarVertice(7);
        
        grafo.agregarArista(1, 2, 4);
        grafo.agregarArista(1, 3, 7);
        grafo.agregarArista(1, 7, 1);
        grafo.agregarArista(1, 6, 5);
        grafo.agregarArista(2, 3, 3);
        grafo.agregarArista(3, 7, 3);
        grafo.agregarArista(3, 4, 5);
        grafo.agregarArista(4, 7, 9);
        grafo.agregarArista(4, 5, 7);
        grafo.agregarArista(5, 6, 8);
        grafo.agregarArista(5, 7, 4);
        grafo.agregarArista(6, 7, 2);
        
        
        //Segundo grafo de prueba
        
        GrafoTDA grafo1 = new Grafo();
        grafo1.inicializarGrafo();
        
        grafo1.agregarVertice(10);
        grafo1.agregarVertice(20);
        grafo1.agregarVertice(30);
        grafo1.agregarVertice(40);
        grafo1.agregarVertice(50);
        grafo1.agregarVertice(60);
        
        grafo1.agregarArista(10,20,3);
        grafo1.agregarArista(10,30,2);
        grafo1.agregarArista(10,40,3);
        grafo1.agregarArista(20,30,1);
        grafo1.agregarArista(20,50,5);
        grafo1.agregarArista(30,40,2);
        grafo1.agregarArista(30,50,7);
        grafo1.agregarArista(30,60,8);
        grafo1.agregarArista(40,60,6);
        grafo1.agregarArista(60,50,4);
        
        
        // Tercer grafo de prueba
        GrafoTDA grafo2 = new Grafo();
        grafo2.inicializarGrafo();
        
        grafo2.agregarVertice(1);
        grafo2.agregarVertice(2);
        grafo2.agregarVertice(3);
        grafo2.agregarVertice(4);
        grafo2.agregarVertice(5);
        grafo2.agregarVertice(6);
        grafo2.agregarVertice(7);
        
        grafo2.agregarArista(7, 1, 3);
        grafo2.agregarArista(7, 2, 4);
        grafo2.agregarArista(1, 2, 1);
        grafo2.agregarArista(2, 3, 3);
        grafo2.agregarArista(1, 5, 2);
        grafo2.agregarArista(3, 4, 1);
        grafo2.agregarArista(4, 6, 1);
        grafo2.agregarArista(1, 4, 3);
        grafo2.agregarArista(5, 4, 2);
        grafo2.agregarArista(5, 6, 3);
        grafo2.agregarArista(2, 5, 1);




        
        
        System.out.println("Grafo 1: ");
        imprimirAristas(Kruskal.algoritmoKruskal(grafo));

        System.out.println("Grafo 2: ");
        imprimirAristas(Kruskal.algoritmoKruskal(grafo1));

        System.out.println("Grafo 3: ");
        imprimirAristas(Kruskal.algoritmoKruskal(grafo2));

    /*     DisjointSetTDA arbol = new DisjointSet();
        arbol.Inicializar();

        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();
        arbol.Agregar();

        arbol.Fusionar(1, 0);
        arbol.Fusionar(1, 2);
        arbol.Fusionar(2, 3);
        arbol.Fusionar(4, 2);

        arbol.Fusionar(5, 6);
        arbol.Fusionar(5, 7);

        arbol.Fusionar(7, 2); */

    }
}
