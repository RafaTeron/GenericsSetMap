package application;

import java.util.HashMap;
import java.util.Map;

import entities.Produto01;

public class Program08 {

	public static void main(String[] args) {
		
		Map<Produto01, Double> stock = new HashMap<>();
		
		Produto01 p1 = new Produto01("Tv", 900.0);
		Produto01 p2 = new Produto01("Notebook", 1200.0);
		Produto01 p3 = new Produto01("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Produto01 ps = new Produto01("Tv", 900.0);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}