package metodo;

public class Metodo {
	
	private String nome;
	private int idade;
	private double[] notas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getNotas() {
		return notas;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void setNotas(double... notas) {//Esses três pontinhos sinaliza um método varargs, apenas usado com arrays
		//Ele sinaliza que não tem a certeza da quantidade de paremetros que sera passado.
		
		this.notas = notas;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public double calcularNotas() {//Foreach para calcular todos os numeros do array e depois dividir pelo tamanho do array
		double aux = 0;
		
		for(double top : this.notas) {
			aux += top;
		}
		aux /= this.notas.length;
		return aux;
	}
}