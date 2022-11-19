package estructuras;

public class Heap implements HeapTDA{
	
	private Arista[] heap;
	private int cantNodos;
	
	public class Arista {
		int destino;
		int origen;
		int peso;
	}
	
	public void Inicializar(int n) {
		heap = new Arista[n];
		cantNodos = 0;
	}
	
	public void Agregar(int origen, int destino, int peso) {
		Arista a = new Arista(); //se crea el nodo arista
		a.origen = origen;
		a.destino = destino;
		a.peso = peso;
		
		cantNodos++;
		heap[cantNodos-1] = a;
		subirNodo(heap, cantNodos-1);
		
	}
	
	private void subirNodo(Arista[] h, int fin) {
		if (fin != 0) {
			int subRaiz = (fin-1)/2;
			if(h[fin].peso < h[subRaiz].peso) { //si el nuevo elemento es menor, no cumple propiedad min heap
				Arista aux = h[fin]; 
				h[fin] = h[subRaiz];
				h[subRaiz] = aux;
				subirNodo(h, subRaiz); 
			}
		}
	}
	
	public Arista Sacar() {
		Arista min = heap[0];
		heap[0] = heap[cantNodos-1]; //se pasa el ultimo elemento al inicio
		cantNodos--;
		
		bajarNodo(heap, 0);
		return min;
	}
	
	private void bajarNodo(Arista[] h, int ini) {
		if (cantNodos > 1) {
			int izq = 2*ini+1; //indice del hijo izquierdo
			int der = 2*ini+2; //indice del hijo derecho
			int min = ini; 
			
			if(izq < cantNodos && h[izq].peso < h[ini].peso) { //si existe el hijo izq y es su peso es menor
				min = izq; //el nodo minimo pasa a ser izq
			}
			
			if(der < cantNodos && h[der].peso < h[min].peso) { //si existe el hijo der y su peso es menor que el del minimo
				min = der; //el nodo minimo pasa a ser der
			}
			
			if (min != ini) { //si el minimo no es el nodo actual, entonces se realiza un intercambio
				Arista aux = h[ini];
				h[ini] = h[min];
				h[min] = aux;
				bajarNodo(h, min);
				
			}
		}
	}

}
