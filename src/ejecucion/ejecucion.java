package ejecucion;

import java.util.ArrayList;

import estructuras.*;
import kruskal.*;

public class ejecucion {
    public static void main(String[] args) throws Exception {
        
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


        ArrayList<Arista> kruskal = Kruskal.algoritmoKruskal(grafo);

    }
}
