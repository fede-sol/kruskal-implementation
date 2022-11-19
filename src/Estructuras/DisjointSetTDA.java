package estructuras;

public interface DisjointSetTDA {

    void Inicializar(int n);
    void Agregar();
    int Id(int n);
    void Fusionar(int n, int m);

}