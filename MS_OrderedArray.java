
public class MS_OrderedArray extends MS_SmallArray {
//MergeSort Variante - Verifica se o vetor está parcialmente ordenado
@Override
	public Comparable[] MergeMain(Comparable[] A, Comparable[] tempA, int esq, int dir) {
		int meio;
		
		if(esq < dir && (esq > 15 || dir>15)) {
			
			meio = (esq + dir)/2; 
			MergeMain(A, tempA, esq, meio );
			MergeMain(A, tempA, meio+1, dir);
			if (A[meio+1].compareTo(A[meio]) >= 0) {
        			return A;	
			}
			Merge(A, tempA, esq, meio+1, dir);
		}
		else {
    
			insertionSort(A,esq,dir);
		}
		
		return A;
	}

}
