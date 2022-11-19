package estructuras;

import java.util.ArrayList;

public class Grafo implements GrafoTDA {

	
	static int n=100;
	int[][]mAdy;
	int[]etiqs;
	int cantNodos;
	
	public void inicializarGrafo(){
		
	   mAdy=new int[n][n];
	   etiqs=new int[n];
	   cantNodos=0;
	}
	public void agregarVertice(int v){
	   etiqs[cantNodos]=v;
	   for(int i=0;i<=cantNodos;i++){
	      mAdy[cantNodos][i]=0;
	      mAdy[i][cantNodos]=0;
	   }
	   cantNodos ++;
	}
	
	private int vert2Indice(int v){
	   int i=cantNodos-1;
	   
	   while(i>=0 && etiqs[i]!=v)
		   i--;
	   return i;
	}
	
	public void eliminarVertice(int v){
		   int ind= vert2Indice(v);
		   
		   for(int i=0;i<cantNodos;i++)
		      mAdy[i][ind]=mAdy[i][cantNodos-1];
		   
		   for(int i=0;i<cantNodos;i++)
		      mAdy[ind][i]=mAdy[cantNodos-1][i];
		   
		   etiqs[ind]=etiqs[cantNodos -1];
		   cantNodos--;
		             
		}
	public void agregarArista(int v1,int v2,int p){
		  int o=vert2Indice(v1);
		  int d=vert2Indice(v2);
		  mAdy[o][d]=p;
		  mAdy[d][o]=p;
	}
		
	public void eliminarArista(int v1,int v2){
		  int o=vert2Indice(v1);
		  int d=vert2Indice(v2);
		  mAdy[o][d]=0;
		  mAdy[d][o]=0;
	}
		
	public int pesoArista(int v1,int v2){
		  int o=vert2Indice(v1);
		  int d=vert2Indice(v2);
		  return mAdy[o][d];
	}        

	

	public ArrayList<Arista> aristas(){
		ArrayList<Arista> lista = new ArrayList<>();

		int j = 0;

		Arista a;

		for(int i = 0; i<cantNodos; i++){
			j = i;
			while(j < cantNodos){
				if(mAdy[i][j] != 0){
					
					a = new Arista();
					a.origen = etiqs[i];
					a.destino = etiqs[j];
					a.peso = mAdy[i][j];
					lista.add(a);
				}
				j++;
			}
		}
		
		return lista;
	}
	
	public boolean existeArista(int v1,int v2){
		int o = vert2Indice(v1);
		int d = vert2Indice(v2);
		return(mAdy[o][d]!=0);
	}

	public int[] vertices(){
		return etiqs;

	}

	public int getCantidadVertices(){
		return cantNodos;
	}

	
}
