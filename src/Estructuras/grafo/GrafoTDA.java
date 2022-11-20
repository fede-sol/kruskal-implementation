package estructuras.grafo;

import java.util.ArrayList;

import estructuras.arista.Arista;



public interface GrafoTDA {

	void inicializarGrafo();
	void agregarVertice(int v);
	void agregarArista(int v1,int v2,int p);
	void eliminarArista(int v1,int v2);
	int pesoArista(int v1,int v2);
	ArrayList<Arista> aristas();
	int[] vertices();
	boolean existeArista(int v1,int v2);
	int getCantidadVertices();
}
