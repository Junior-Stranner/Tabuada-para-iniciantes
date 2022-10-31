package tabuada;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Tabuada t = new Tabuada();
	int res = 0;
	int certo=0;
	int erro =0;
		
		System.out.println("---Digite 1 para mostrar a Tabuada---");
		int a = Integer.parseInt(in.nextLine());
		
		System.out.println("---------------");
		System.out.println(" digite um  numero");
		t.x =Integer.parseInt(in.nextLine());
		
		for(t.y = 1; t.y < 11; t.y++) {
			 
			t.mult = t.x * t.y;
			System.out.println(t.x +"*"+t.y +"="+t.mult);
		}
		    System.out.println("");
			System.out.println("---Digite 2 para a segunda tabuada---");
			int b = Integer.parseInt(in.nextLine());
			
			for(t.y = 1; t.y < 11; t.y++) {
				 
				t.mult = t.x * t.y;
				System.out.print(t.x +"*"+t.y +"=");
				res = Integer.parseInt(in.nextLine());
				
			
			if(res == t.mult) {
				certo++;
				
			}else
				erro++;
			
	       }
			System.out.println("acrtos "+certo+"vezes");
			System.out.println("errou"+erro+"vezes");
			
		}
	}

