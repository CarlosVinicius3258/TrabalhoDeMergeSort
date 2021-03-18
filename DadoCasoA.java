
public class DadoCasoA implements Comparable<DadoCasoA>{
	private String chave;
	private double valor;
	
	public DadoCasoA(String chave, double valor) {
		this.setChave(chave);
		this.setValor(valor);
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public int compareTo(DadoCasoA B) {
		DadoCasoA data = B;
		data.getChave().toUpperCase();
		int stringSize1 = this.getChave().length();
		int stringSize2 = data.getChave().length();
		
		if(this.getChave().equals(data.getChave())) {
			return 0;
		}else {
			int i = 0;
			while(i < stringSize1 && i < stringSize2) {
				if ((int) this.getChave().charAt(i) < (int) ((DadoCasoA) B).getChave().charAt(i)) {
					return -1;
				}else if((int) this.getChave().charAt(i) > (int) ((DadoCasoA) B).getChave().charAt(i)) {
					return 1;
				}
				i++;
			}
			
			if(i < stringSize1) {
				return -1;
			}else {
				return 1;
			}
		}
	}
	

}