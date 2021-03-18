
public class DadoCasoB implements Comparable<DadoCasoB>{
	private double chave;
	private String valor;
	
	public DadoCasoB (double chave, String valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public double getChave() {
		return chave;
	}
	public void setChave(double chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(DadoCasoB B) {
		DadoCasoB data = B;
		
		if(this.getChave() == data.getChave()) {
			return 0;
		}else if(this.getChave() < data.getChave()) {
			return -1;
		}else {
			return 1;
		}
	}
	
	
}
