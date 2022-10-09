package project6;

import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class ta06_11 {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamany array 1: ");
		int tamany1 = sc.nextInt();
		
		int num[] = new int[tamany1];
		arrayAleatori(num, tamany1);
		
		for(int n = 0; n < tamany1; n++) {
			System.out.println("Index: "+n+" valor: "+num[n]);
		}				
		
		System.out.print("Tamany array 2: ");
		int tamany2 = sc.nextInt();
		
		int num2[] = new int[tamany2];
		
		//array num2 ocupa la mateixa posició que array num
		num = num2;
		
		arrayAleatori(num2, tamany2);
		
		//Reasignació
		for(int n = 0; n < tamany2; n++) {
			System.out.println("Index: "+n+" valor: "+num2[n]);
		}		
		
		array(num, num2, tamany2);
		
		sc.close();
								
	}
	
	public static int[] arrayAleatori (int num[], int tamany1) {
		
		int k = 0;
		
		Random rand = new Random(); 
									
		for(k = 0; k < tamany1; k++) {
			int rand1 = rand.nextInt(100);
			num[k] = rand1; 			
		}
		
		return num;
	}
	
	public static void array (int num[], int num2[], int tamany2) {
		
		int mult[] = new int[tamany2];
		
		for(int k = 0; k < tamany2; k++) {
			
			mult[k] = num[k] * num2[k];			
		}
		
		System.out.println("Mult: "+Arrays.toString(mult)); 				
		
	}

}
