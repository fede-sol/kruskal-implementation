package ejecucion;

import estructuras.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        DisjointSetTDA ds = new DisjointSet();

        ds.Inicializar(10);

        ds.Agregar(1);
        ds.Agregar(2);
        ds.Agregar(3);
        ds.Agregar(4);
        ds.Agregar(5);
        ds.Agregar(6);
        ds.Agregar(7);
        ds.Agregar(8);
        ds.Agregar(9);

        ds.Fusionar(3, 2);
        ds.Fusionar(2, 4);
        ds.Fusionar(4, 1);
        ds.Fusionar(2, 1);
        ds.Fusionar(5, 6);
        ds.Fusionar(5, 8);
        
        ds.Fusionar(3, 8);
        
        ds.Fusionar(9, 8);
        System.out.println(ds.Id(8));
    }
}
