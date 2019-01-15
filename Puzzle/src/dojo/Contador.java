package dojo;

public class Contador {

	public int numero(int n) {
		int quant[] = {4,2,4,4,6,5,4,4,4,4};
		String str = Integer.toString(n);
		int tamanho = str.length();
		int retorno = 0, unidade;
		char aux;
		
		for(int i=0; i<tamanho ; i++) {
			aux = str.charAt(i);
			unidade = Character.getNumericValue(aux);
			retorno += quant[unidade];
		}
		return retorno;
		
	}
	
	public int acumula(int n) {
		int retorno = 0;
			for(int i = 1; i<=n ; i++) {
				retorno += numero(i);
			}
		return retorno;
		
	}
	
}
