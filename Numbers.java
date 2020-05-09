
public class Numbers {

	public static void main(String[] args) {
	
	//1 - Imprima todos nºs de 150 a 300
	for(int i = 150; i <= 300; i++) {
		System.out.println(i);
			
		}
		
	//2 - 	Imprima a soma de 1 até 1000
	int soma = 0; 
	for(int i = 1; i <= 1000; i++) {
		soma += i;
		
		}
	System.out.println("\n"+ soma + "\n");
	

	
	//3 - Multiplos de 3 de 1 a 100
	for(int i = 1; i < 100; i++) {
		if(i % 3 == 0) {
			System.out.println(i);
			}
		}
	//4 - Fatorial de 1 a 10
	int fat = 1;
	for(int i = 1; i < 10; i++) {
		while(i >= 2) {
			fat = fat * i;
			break;
			}
			System.out.println(fat);
		}
	//DESAFIO - Série Fibonacci com 2 variaveis (tentativa)
	
	long n1 = 0, n2 = 1, fibo;
	for (int i = 0; i < 20; i++) {
		if(i==0) {
			fibo = n1;
		}else {
			fibo = n1 + n2;
			n1 = n2;
			n2 = fibo;
		
	            System.out.print(fibo + " ");
	        }
	  
	    }
	  
	}
}