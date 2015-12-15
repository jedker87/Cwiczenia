package Sklep;

public class Shop {
	
public static void main(String[] args){
	
String p1 = "Monitor";
String p2 = "Laptop";

double c1 = 700;
double c2 = 3000;

System.out.println("Produkty: ");
System.out.println(p1 + " - " + c1 + " pln");
System.out.println(p2 + " - " + c2 + " pln");

Product[] products = new Product[2];

products[0] = new Product("Samsung", 700.0);
products[1] = new Product("HP", 3000.0);

System.out.println(products[0].getProductInfo());
System.out.println(products[1].getProductInfo());

}

}
