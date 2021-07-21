
public class Principal {

	public static int convertir() {
		return Integer.parseInt("7");
	}
	
	public static int v1(int a) {
		return (a++)*2;
	}
	
	public static int v2(int a) {
		return (++a)+2;
	}
	public static void main(String[] args) {
		
		 int a =1;
		 System.out.println(v2(++a));
	}
	
	
}
