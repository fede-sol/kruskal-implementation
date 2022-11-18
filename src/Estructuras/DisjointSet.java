package Estructuras;

public class DisjointSet {

    private int[] array;

    public void Inicializar(int n) {
        array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = -1;
        }
    }
    
}
