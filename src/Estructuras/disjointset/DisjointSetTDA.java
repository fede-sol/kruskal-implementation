package estructuras.disjointset;

public interface DisjointSetTDA {

    void Inicializar();
    void Agregar();
    int Id(int n);
    void Fusionar(int n, int m);

}