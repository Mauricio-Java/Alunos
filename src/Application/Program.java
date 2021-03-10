package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// Verificar se o aluno passou 
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
	   System.out.println(" Entre com o nome do aluno");
	   aluno.name=sc.nextLine();
	   
	   System.out.println(" Primeira nota");
	   aluno.nota1 =sc.nextDouble();
	   
	   System.out.println(" Segunda nota");
	   aluno.nota2 =sc.nextDouble();
	   
	   System.out.println(" Terceira nota");
	   aluno.nota3 =sc.nextDouble();
	   
	   
	   System.out.printf(" Nota final : %.2f%n",aluno.notaFinal());
	   
	   
	   if (aluno.notaFinal() <60.0){
		   
		   System.out.println(" FAILED");
		   System.out.printf(" Pontos faltantes %.2f%n", aluno.pontosFaltantes());
	   }
	   else {
		   System.out.println("PASS");
	   }
	   sc.close();
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

		   
	  
		



