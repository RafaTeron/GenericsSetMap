package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidato;

public class Program09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<Candidato, Integer> map = new HashMap<>();
			
			String line = br.readLine();
			while (line != null) {
			
				String[] fields = line.split(",");
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);
				Candidato candidato = new Candidato(nome, votos);
				map.add(candidato);
				
				line = br.readLine();			
		
			}
			
			System.out.println("Total users: " + set.size());
		
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
