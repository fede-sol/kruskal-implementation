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

        ArrayList<Arista> aristasDelGrafo = g.aristas();

        HeapTDA aristasOrdenadas = new Heap();

        aristasOrdenadas.Inicializar(aristasDelGrafo.size());

        for (Arista arista : aristasDelGrafo) 
            aristasOrdenadas.Agregar(arista.origen, arista.destino, arista.peso);
        

        int[] vertices = g.vertices();

        DisjointSetTDA arbol = new DisjointSet();
        arbol.Inicializar(g.getCantidadVertices());


        
        for(int i = 0; i<g.getCantidadVertices();i++)
            arbol.Agregar();
        
        

        ArrayList<Arista> aristasDelSpanningTree = new ArrayList<>();

        Arista aux;
        
        while(aristasDelSpanningTree.size() < g.getCantidadVertices()-1){
            aux = aristasOrdenadas.Sacar();


            
            if(arbol.Id(aux.origen) != arbol.Id(aux.destino)){
                arbol.Fusionar(aux.origen, aux.destino);
                aristasDelSpanningTree.add(aux);
            }
        }

        return aristasDelSpanningTree;
    }


}
