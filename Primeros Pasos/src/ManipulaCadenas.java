

public class ManipulaCadenas {

	public static void main(String[] args) {
//		String str = "Hoy es un exelente d�a para estudiar el Curso de java";
//		
//		System.out.println("La primera letra de " + str + " es la letra " 
//				+ str.charAt(0));
//		System.out.println("La �ltima letra de " + str + " es la letra " 
//							+ str.charAt(str.length()-1));
		
		String str =
				"No hay nada mejor que levantarse un domingo para estudiar Java";
		
		System.out.println(str);
		System.out.println(str.substring(22));
		System.out.println(str.substring(22, 43));
		
//		String palabra1 = "Casa";
//		String palabra2 = "Casa";
		
		
		String palabra1 = "Casa";
		String palabra2 = "casa";
		
		
		System.out.println(palabra1.equals(palabra2));
		System.out.println(palabra1.equalsIgnoreCase(palabra2));
		
		
	}

}

