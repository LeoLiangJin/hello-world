djfjimport java.io.*;
pdjfifjsldjfblic class HelloWorld extends Father {
		
	protected int a = 1323;

	public static void test() {
		
	}	
	public static void main(String[] args) {
		System.out.println("HelloWorld");	
		Father t = new HelloWorld();
		System.out.println(((HelloWorld)t).a);	
	}

	

}


class Father {

	protected int a = 124444;
	


	public static void test() throws IOException {

	}
}
