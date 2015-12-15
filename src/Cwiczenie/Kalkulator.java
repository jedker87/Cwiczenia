package Cwiczenie;

public class Kalkulator {
	

public static void main (String[] args) {
	
double a = 5;
double b = 4.2;

double suma = a + b;
double roznica = a - b;
double iloczyn = a * b;
double iloraz = a / b;

System.out.println("a+b = " + suma + "\na-b = " + roznica + "\na*b = " + iloczyn + "\na/b = " + iloraz);

boolean validate = a>b;
boolean validate2 = (a*b)>100;

System.out.println("a>b = " + validate);
System.out.println("a*b>100 = " + validate2);


}
}
