package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		final double PI = 3.14159; // colocando inicio transforma a variavel em uma constante (n�o muda o valor)
		
		double area = PI * raio * raio; // calculo do raio da transferencia
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " + area + "m2.");
	}

}
