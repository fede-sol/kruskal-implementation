package estructuras;

import java.util.ArrayList;



public interface GrafoTDA {

	void inicializarGrafo();// Sin precondiciones
	void agregarVertice(int v);// Grafo inicializadoyno existe nodov
	void eliminarVertice(int v);// Grafo inicializadoyexiste nodovvoid EliminarVertice(int
	void agregarArista(int v1,int v2,int p);// Grafo inicializadoyno existe arista(v1,v2)
	void eliminarArista(int v1,int v2);// Grafo inicializadoyexiste arista(v1,v2)
	int pesoArista(int v1,int v2);// Grafo inicializadoyexiste arista(v1,v2)
	ArrayList<Arista> aristas();// Grafo inicializado
	int[] vertices();
	boolean existeArista(int v1,int v2);// Grafo inicializado y existen nodos v1,v2
	int getCantidadVertices();
}
