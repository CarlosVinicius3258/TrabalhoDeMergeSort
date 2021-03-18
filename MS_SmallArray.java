
public class MS_SmallArray extends MergeSort{

  // Algoritmo Insertion Sort - Chamado no Merge Sort, caso o vetor tenha menos que 15 elementos
	public void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++)
            for (int j = i; j > lo && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
    }

	 public void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
  //Merge Sort Variante - Verifica se o vetor possui menos que 15 elementos, caso sim, usa o Insertion Sort
	@Override
	public Comparable[] MergeMain(Comparable[] A, Comparable[] tempA, int esq, int dir) {
		int meio;
		
		if(dir-esq+1 < 15) {
  
			insertionSort(A, esq, dir);
		}
		else {
			meio = (esq + dir)/2;
			MergeMain(A, tempA, esq, meio );
			MergeMain(A, tempA, meio+1, dir);
			Merge(A, tempA, esq, meio+1, dir);
			
		}

	 return A;
	}
	
}
