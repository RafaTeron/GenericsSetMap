package application;

import entitie.Cliente;

public class Program03 {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente ("Maria","mariaabreu@gmail.com");
		Cliente c2 = new Cliente ("Jo�o","joaoabreu@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(s1 == s2);

	}

}
