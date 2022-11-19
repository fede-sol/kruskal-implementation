package Estructuras;

public class DisjointSet {

    private int[] array;

    public void Inicializar(int n) {
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = -1;
        }
    }

    public void Fusionar(int n, int m) {

        
        
    }

    public int Id(int n) {

        if(array[n] > 0) { //si tengo un nro POSITIVO --> sigo buscando
            n = array[n]; //ahora paso a buscar la raiz del que estaba en la posicion n
            return array[n] = Id(n); //para optimizar, todos apuntan a la raiz, cuando vuelva a buscar van a ser menos llamadas
        } else {
            return n; //si tengo un nro negativo --> encontre el identificador
        }

        
    }
    
}
