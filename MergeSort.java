
public class MergeSort {



   //Método que junta subvetores
	protected void Merge(Comparable[] A, Comparable[] tempA, int esqPos, int dirPos, int dirFim) {
		int esqFim = dirPos - 1;
		int tempPos = esqPos;
		int numElem = dirFim - esqPos + 1;
		while(esqPos <= esqFim && dirPos <= dirFim) {
			
			if(A[esqPos].compareTo(A[dirPos]) <= 0) {
				tempA[tempPos++] = A[esqPos++];
       
			}
			else {
				tempA[tempPos++] = A[dirPos++];
       
			}
			
		}
		//aloca vetor esquerdo restante
		
		while(esqPos <= esqFim) {
			tempA[tempPos++] = A[esqPos++];
    
		}
		
		//aloca vetor direito restante
		while(dirPos <= dirFim) {
			tempA[tempPos++] = A[dirPos++];
     
		}
		
		//Cópia do vetor auxiliar para o vetor original
		for(int i=0; i < numElem; i++, dirFim--) {
			A[dirFim] = tempA[dirFim];
     
		}
	}
	//Método que faz chamadas recursivas e separa os subvetores
	 protected Comparable[] MergeMain(Comparable[] A, Comparable[] tempA, int esq, int dir) {
		int meio;
		if(esq < dir) {
			meio = (esq + dir)/2;
	
			MergeMain(A, tempA, esq, meio );
			MergeMain(A, tempA, meio+1, dir);
			Merge(A, tempA, esq, meio+1, dir);
		}
	
		return A;
	}
	//Método que chama o Merge Sort com parâmetro de Vetor a ser ordenado
	public Comparable[] MergeSort(Comparable[] A) {
		
		Comparable [] tempA = new Comparable[A.length];
		int tam = A.length;
			
		return MergeMain(A, tempA, 0, tam-1);
	
	}
}
