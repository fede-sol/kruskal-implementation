package kruskal;

import java.util.ArrayList;

import estructuras.Arista;
import estructuras.DisjointSet;
import estructuras.DisjointSetTDA;
import estructuras.GrafoTDA;
import estructuras.Heap;
import estructuras.HeapTDA;

public class Kruskal {



    
    public static ArrayList<Arista> algoritmoKruskal(GrafoTDA g){

        ArrayList<Arista> aristasDelGrafo = g.aristas(); //Primero se consigue una lista de las aristas del grafo

        HeapTDA aristasOrdenadas = new Heap();

        aristasOrdenadas.Inicializar();

        for (Arista arista : aristasDelGrafo) 
            aristasOrdenadas.Agregar(arista.origen, arista.destino, arista.peso);
        

        int[] vertices = g.vertices();

        DisjointSetTDA arbol = new DisjointSet();
        arbol.Inicializar();


        
        for(int i = 0; i < g.getCantidadVertices(); i++) //agrega todos los vertices del grafo al arbol Disjoint Set
            arbol.Agregar();
        
        

        ArrayList<Arista> aristasDelSpanningTree = new ArrayList<>();

        Arista aux;
        
        while(aristasDelSpanningTree.size() < g.getCantidadVertices()-1){  //el ciclo termina cuando se llegue a n-1 aristas, siendo n la cantidad de vertices
            aux = aristasOrdenadas.Sacar(); //la arista de menor costo

            if(arbol.Id(aux.origen) != arbol.Id(aux.destino)){ //si los nodos no pertenecen al mismo arbol, se agrega al 
                arbol.Fusionar(aux.origen, aux.destino);       //arbol de recubrimiento minimo
                aux.origen = vertices[aux.origen];
                aux.destino = vertices[aux.destino];
                aristasDelSpanningTree.add(aux);
            }
        }

        return aristasDelSpanningTree;
    }


}
