package test;

import metodo.Metodo;
import java.util.Scanner;
public class Test {
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		Metodo aluno = new Metodo();
		
		System.out.println("Nome: ");
		aluno.setNome(scan.next());
		
		System.out.println("Idade: ");
		aluno.setIdade(scan.nextInt());
		
		System.out.println("Notas: ");
		aluno.setNotas(5,4,6,7,4,4,5);//Podemos passar quantos a gente quiser
		
		System.out.println("Média: "+aluno.calcularNotas());
	}
}