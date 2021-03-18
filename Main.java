import java.util.*;



public class Main {

	public static void printArray(Comparable[] array){
		int size = array.length;
		
		for(int i=0; i<size; i++){
			System.out.println(array[i] + " ");
		}
		System.out.println();
	}
	
public static void main(String[] args) {
  		
  	
		
		
  		Reader reader = new Reader();
    
       Comparable[] vectorAux = reader.abrirArquivo(); // 1 - Merge Tradicional, 2 - Merge com Insertion Sort, 3 - Merge com vetor Ordenado

       //MergeSort merge = new MergeSort();
       //MS_SmallArray merge = new MS_SmallArray();
       MS_OrderedArray merge = new MS_OrderedArray();

       
      
  		
  		double i1 =  System.currentTimeMillis();//Contagem de tempo inicial
  		Arrays.sort(vectorAux);
  		double i2 =  System.currentTimeMillis();//Contagem de tempo final
  		
  		System.out.println(i2-i1);// printa a Diferença de tempo
    

  	}
	
}
