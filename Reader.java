import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Reader {
public Comparable[] abrirArquivo(int opcao){
		
		Comparable[] vector = null; 
		

		JFileChooser seletor = new JFileChooser();
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("text files", "txt", "csv");
		seletor.setFileFilter((javax.swing.filechooser.FileFilter) filtro);
		
		seletor.addChoosableFileFilter((javax.swing.filechooser.FileFilter) filtro); 
		
		seletor.setDialogTitle("Select a file...");
		seletor.showOpenDialog(new JFrame("")); 
		seletor.setVisible (true);
		String address = seletor.getSelectedFile().getAbsolutePath(); 
		File file = new File(address);
		
		if(opcao == 1) {
			vector = lerString(address, file);
		}
		else if(opcao == 2) {
			vector = lerDouble(address, file);
		}
		else {
			vector = lerInt(address, file);
		}
		
		
		if(vector!=null) {
			return vector;
		}
		
		return null;
		
		
		}
		
	public static void printArrayString(Comparable[] array){
		int size = array.length;
		
		DadoCasoA k = null;
		for(int i=0; i<size; i++){
			k = (DadoCasoA) array[i];
			System.out.println(k.getChave());
		}
		System.out.println();
	}
	
			
	public Comparable[] lerString(String address, File file){
		
		int numL = numLinhasArquivo(address);
		System.out.println(numL);
		Comparable[] vetor = new Comparable[numL];
		
		if (file.canRead()) {
			
			DadoCasoA key = null;
			;
			
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				
				String line = br.readLine();
				int i = 0;
				
				while (line != null) {
					String[] vect = line.split(",");
					
	                String chave = vect[0];
	                System.out.println(chave);
	                double valor = Double.parseDouble(vect[1]);
	                System.out.println(valor);
	                key = new DadoCasoA(chave, valor);
	                vetor[i++] = key;
	                

					line = br.readLine();
					
				}
			}
			catch (IOException e) { // Exceções FileNotFoundException   
		        System.out.println(e.getMessage());   
		    }
				
		}
		
		return vetor;
		
			
	}
			

	public Comparable[] lerDouble(String address, File file){
		
		int numL = numLinhasArquivo(address);
		System.out.println(numL);
		Comparable[] vetor = new Comparable[numL];
		
		if (file.canRead()) {
			
			DadoCasoB key = null;
			
			
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				
				String line = br.readLine();
				int i = 0;
				while (line != null) {
					String[] vect = line.split(",");
					
					double chave = Double.parseDouble(vect[0]);
	                String valor = vect[1];
	                		                
	                key = new DadoCasoB(chave, valor);
	                vetor[i++] = key;
	                

					line = br.readLine();
					
				}
			}
			catch (IOException e) { // Exceções FileNotFoundException   
		        System.out.println(e.getMessage());;   
		    }
				
		}
		
		return vetor;
		
			
	}
	
	public static void printArrayDouble(Comparable[] array){
		int size = array.length;
		//String k = null;
		DadoCasoB k = null;
		for(int i=0; i<size; i++){
			k = (DadoCasoB) array[i];
			System.out.println(k.getChave());
			
		}
		System.out.println();
	}		
				
				
			

	public Comparable[] lerInt(String address, File file){
		
		int numL = numLinhasArquivo(address);
		Comparable[] vetor = new Comparable[numL];
		
		if (file.canRead()) {
			
			DadoCasoC key = null;
			
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {
				
				String line = br.readLine();
				int i = 0;
	
				while (line != null) {
					String[] vect = line.split(",");
					
					int chave = Integer.parseInt(vect[0]);
	                int valor = Integer.parseInt(vect[1]);
	                		                
	                key = new DadoCasoC(valor, chave);
	                vetor[i++] = key;
	                

					line = br.readLine();
					
				}
			}
			catch (IOException e) { // Exceções FileNotFoundException   
		        System.out.println(e.getMessage());;   
		    }
			
		}
		
		return vetor;
		
			
	}
	
	public static void printArrayInt(Comparable[] array){
		int size = array.length;
	
		DadoCasoC k = null;
		for(int i=0; i<size; i++){
			k = (DadoCasoC) array[i];
			System.out.println(k.getChave());
		}
		System.out.println();
	}		
				
			

	public int numLinhasArquivo(String address) {//função necessaria para inicializar o vetor
		int numLin = 0;
		try {		
			Scanner arq = new Scanner (new File (address));	      
	        while (arq.hasNextLine()){
	        	arq.nextLine();
	        	numLin ++;
	        }
		}
		catch (IOException e) { // trata as exceções do tipo FileNotFoundException   
	        System.out.println(e.getMessage());;   
	    }
		return numLin;
	}	
}
