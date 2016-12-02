
class integer {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		System.out.println("Real Value of A is:- " +a);
		System.out.println("Real Value of B is:- " +b);
		
		 b=a-- - --a;
		
		System.out.println("Value of B is:- " +b);
		
		int c=a--;
		System.out.println("Value of C is:- " +c);

		int d=a>>2;
		System.out.println("Value of D is:- " +d);
		
		int e=a&b;
		System.out.println("Value of E is:- " + e);
	}

}
