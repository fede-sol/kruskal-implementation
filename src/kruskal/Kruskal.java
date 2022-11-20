package kruskal;

import java.util.ArrayList;

import estructuras.arista.Arista;
import estructuras.disjointset.DisjointSet;
import estructuras.disjointset.DisjointSetTDA;
import estructuras.grafo.GrafoTDA;
import estructuras.heap.Heap;
import estructuras.heap.HeapTDA;

public class Kruskal {



    
    public static ArrayList<Arista> algoritmoKruskal(GrafoTDA g){

        ArrayList<Arista> aristasDelGrafo = g.aristas(); //Primero se consigue una lista de las aristas del grafo

        HeapTDA aristasOrdenadas = new Heap();

        aristasOrdenadas.Inicializar();

        for (Arista arista : aristasDelGrafo) // Se agregan las aristas al heap
            aristasOrdenadas.Agregar(arista.origen, arista.destino, arista.peso);
        

        int[] vertices = g.vertices(); // Se guardan los vértices del grafo


        DisjointSetTDA arbol = new DisjointSet();
        arbol.Inicializar();


        
        for(int i = 0; i < g.getCantidadVertices(); i++) //agrega todos los vertices del grafo al arbol Disjoint Set
            arbol.Agregar();
        
        

        ArrayList<Arista> aristasDelSpanningTree = new ArrayList<>(); // en esta variable se van a guardar las aristas seleccionadas por kruskal

        Arista aux;
        
        while(aristasDelSpanningTree.size() < g.getCantidadVertices()-1){  //el ciclo termina cuando se llegue a n-1 aristas, siendo n la cantidad de vertices
            aux = aristasOrdenadas.Sacar(); //la arista de menor costo

            if(arbol.Id(aux.origen) != arbol.Id(aux.destino)){ //si los nodos no pertenecen al mismo arbol, se agrega al 

                arbol.Fusionar(aux.origen, aux.destino);       //arbol de recubrimiento minimo

                
                /*
                 * Se reescriben los identificadores de los vertices ya que hasta ahora se venia usando el índice
                 */
                aux.origen = vertices[aux.origen]; 
                aux.destino = vertices[aux.destino];

                aristasDelSpanningTree.add(aux);
            }
        }

        return aristasDelSpanningTree;
    }


}
