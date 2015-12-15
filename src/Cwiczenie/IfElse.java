package Cwiczenie;

public class IfElse {

public static void main(String[] args){
	
	int a = 20;
	int b = 20;
	
	if(a == b){
		System.out.println("liczby a i b sa rowne");
	}else if (a>b){
			System.out.println("a jest wieksze od b");
	}else{
				System.out.println("a jest mniejsze od b");
			}
	
	int number = 5;
	
	int option = 3;
	
	switch(option) {
	
	case 1:
		System.out.println(number +"^1" + "=" + number);
		break;
	case 2:
		System.out.println(number + "^2" + "=" + number*number );
		break;
	case 3:
		System.out.println(number + "^3" + "=" + number*number*number);
		break;
	case 4:
		System.out.println(number + "^4" + "=" + number*number*number*number);
		break;
	default:
		System.out.println("wybrano nie poprawna opjce");
	}
	
		}
	}




