package estructuras;

import estructuras.Heap.Arista;

public interface HeapTDA {
	
	void Inicializar(int n);
	void Agregar(int origen, int destino, int peso);
	Arista Sacar();

}
