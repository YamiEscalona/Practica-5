import java.util.Scanner; // Se importa la clase Scanner. 

public class Codigo5 {

	// Se agrego System.in
	    Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ');
	    String ni = s.nextLine();

	    int c = ni;
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (int)(ni % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }

	    if (afo > noAfo) {
	      System.out.prinln("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	  
	}