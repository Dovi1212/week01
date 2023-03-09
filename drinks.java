package personal;

public class drinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Margarita;
double literTequila = 45.00;
double literLimeJuice = 8.00;
double literTriplesec = 20.00;

double oneOzTequila = literTequila / 33;
double oneOzLimeJuice = literLimeJuice / 33; 
double oneOzTriplesec = literTriplesec / 33; 
double margaritaCost;


Margarita = "2 oz Tequila, " + "1 oz Lime Juice, " + "0.5 oz Triple sec.";
margaritaCost = oneOzTequila * 2 + oneOzLimeJuice + oneOzTriplesec / 2;



System.out.println(Margarita);
System.out.println("The price to make a margarita is " + margaritaCost + "$");







	}

}
