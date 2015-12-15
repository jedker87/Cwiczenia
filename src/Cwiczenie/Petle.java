package Cwiczenie;

public class Petle {

	public static void main(String[] args){
		
		int[] calkowite = new int[50];
		
		System.out.println(calkowite.length);
		
		int i = 0;
		while(i<calkowite.length){
			calkowite[i] = i + 1;
			i = i + 1;
			
		}
			
		i = 0;
		
		do{
			System.out.println(calkowite[i] + ";");
			i = i + 1;}
		 while (i < calkowite.length);
		}
	
		
	}

