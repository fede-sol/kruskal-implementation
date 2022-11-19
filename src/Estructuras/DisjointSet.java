package estructuras;

public class DisjointSet implements DisjointSetTDA{

    private int[] array;

    public void Inicializar(int n) {
        array = new int[n];
    }

    public void Agregar(int n) {
        array[n] = -1;
    }

    public void Fusionar(int n, int m) {

        n = Id(n);
        m = Id(m);

        if(n == m)
            return;

        if(array[n] < array[m]){
            array[n] += array[m];
            array[m] = n;
        } else{
            array[m] += array[n];
            array[n] = m;
        }
        
    }

    public int Id(int n) {

        if(array[n] > 0) { //si tengo un nro POSITIVO --> sigo buscando
            n = array[n]; //ahora paso a buscar la raiz del que estaba en la posicion n
            return Id(n); //para optimizar, todos apuntan a la raiz, cuando vuelva a buscar van a ser menos llamadas
        } else {
            
            return n; //si tengo un nro negativo --> encontre el identificador
        }

        
    }
    

    
}
