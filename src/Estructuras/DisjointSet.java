package estructuras;

import java.util.ArrayList;

public class DisjointSet implements DisjointSetTDA{

    private int[] array;
    private int indice;

    public void Inicializar() {
        array = new int[100];
        indice = 0;
    }

    public void Agregar() {
        array[indice] = -1;
        indice++;
    }

    public void Fusionar(int n, int m) {

        // Se busca la raiz del arbol de cada nodo
        n = Id(n); 
        m = Id(m);

        if(n != m){ //si no pertenecen al mismo arbol

            if(array[n] < array[m]){  // elige el arbol de mayor peso
                array[n] += array[m]; // se suma el peso de un árbol a otro
                array[m] = n;  // se cambia la raiz de un arbol por la del otro
            } else{
                array[m] += array[n];
                array[n] = m;
            }
        }
        
        
    }

    public int Id(int n) {

        ArrayList<Integer> recorrido = new ArrayList<>();

        while(array[n] >= 0) { //si tengo un nro POSITIVO --> sigo buscando
            recorrido.add(n);
            n = array[n]; //ahora paso a buscar la raiz del que estaba en la posicion n
        }


        /*
         * Este bucle sirve para realizar la path compression que permite que la búsqueda sea de costo constante
         *
         * Se recorre el camino realizado para llegar a la raiz cambiando el padre de cada nodo y asignandole la raiz como padre directo
         */
        int i = 0;
        
        while(i < recorrido.size()){
            array[recorrido.get(i)] = n;
            i++;
        }
        
        return n; //si tengo un nro negativo --> encontre el identificador
        
    }
    

    
}
