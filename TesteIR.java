import java.util.Scanner;

public class TesteIR {
	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double salario;   
			    
			    System.out.println("Digite seu salario entre R$1900.00 e R$4664.00: ");
			    salario = entrada.nextInt();
			
			if (1900.0 <= salario && salario <= 2800.0){
				salario = salario * (7.5/100);
				System.out.println(" o IR é de 7.5% e pode deduzir na declaração o valor de:  " + salario);
			
			} else if (2800.01 <= salario && salario <= 3751.0){ 
				salario = salario * (15/100);
				System.out.println(" o IR é de 15% e pode deduzir na declaração o valor de:  " + salario);
			} else if (3751.0 <= salario && salario <= 4664.0) {
				salario = salario * (22.5/100);
				System.out.println(" o IR é de 22.5% e pode deduzir na declaração o valor de:  " + salario);
			}else {
				System.out.println("Valor fora da margem de calculo");
			}
			
		}
	}

}
