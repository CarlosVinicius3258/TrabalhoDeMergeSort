
public class DadoCasoC implements Comparable<DadoCasoC>{
	private int chave;
	private int valor;
	
	public DadoCasoC (int chave, int valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(DadoCasoC B) {
		DadoCasoC data = B;
		
		if(this.getChave() == data.getChave()) {
			return 0;
		}else if(this.getChave() < data.getChave()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
