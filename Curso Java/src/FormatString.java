
public class FormatString {

	public static void main(String[] args) {
		
		
		System.out.printf("%d", 10);
		System.out.println();
		System.out.printf("%f", 10.1);
		System.out.println();
		System.out.printf("%c", 'a');
		System.out.println();
		System.out.printf("%C", 'a');
		System.out.println();
		System.out.printf("%s", "hello");
		System.out.println();
		System.out.printf("%S", "hello");
		System.out.println();
		System.out.printf("%b", 5 < 4);
		System.out.println();
		System.out.printf("%e", 10.123);
		System.out.println();
		System.out.printf("%E", 10.123);
		System.out.println();
		System.out.printf("%g", 10000.0);
		System.out.println();
		System.out.printf("%G", 10000.0);
		System.out.println();
		System.out.printf("%o", 10);
		System.out.println();
		
//		Rellenar con 0
		System.out.printf("%04d", 1);
		System.out.println();
		
//		Rellenar con espacios
		System.out.printf("%10s", "Hola");
		System.out.println();
		
//		String colName = "col2";
		
//		System.out.printf("Col1 | %10s", colName);
		

	}

}
