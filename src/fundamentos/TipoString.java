package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Óla pessoal".charAt(4));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
	}
}
