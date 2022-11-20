package estructuras.heap;

import estructuras.arista.Arista;

public interface HeapTDA {
	
	void Inicializar();
	void Agregar(int origen, int destino, int peso);
	Arista Sacar();

}
