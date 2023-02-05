package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> quant = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
			
				String[] fields = line.split(",");
				String nome = fields[0];
				int votos = Integer.parseInt(fields[1]);
				
				if (quant.containsKey(nome)) {
					int votesSoFar = quant.get(nome);
					quant.put(nome, votos + votesSoFar);
				}
				else {
					quant.put(nome, votos);
				}
				
				line = br.readLine();
			}
			
			for (String key : quant.keySet()) {
				System.out.println(key + ": " + quant.get(key));
			}
		
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
