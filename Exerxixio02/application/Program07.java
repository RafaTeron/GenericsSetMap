package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Portal;

public class Program07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Portal> set = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int turmaA = sc.nextInt();
		for(int i=1; i<=turmaA; i++) {
			int ID = sc.nextInt();
			set.add(new Portal(ID));
		}
		
		System.out.print("How many students for course B?");
		int turmaB = sc.nextInt();
		for(int i=1; i<=turmaB; i++) {
			int ID = sc.nextInt();
			set.add(new Portal(ID));
		}
		
		System.out.print("How many students for course C?");
		int turmaC = sc.nextInt();
		for(int i=1; i<=turmaC; i++) {
			int ID = sc.nextInt();
			set.add(new Portal(ID));
		}
		
		System.out.println("TOTAL ALUNOS : " + set.size());
		
		sc.close();
		
	}

}
