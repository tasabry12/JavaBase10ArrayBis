import java.util.Random;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		double totaleIncassi = 0;
		double incasso = 0;
		
		for (int giorno=1; giorno<=30;giorno++)
		{
		System.out.println("L'incasso del giorno "+giorno+" è :");
		incasso=r.nextDouble()*10000;
		System.out.println(incasso);
		
		totaleIncassi+=incasso;
		}
		double mediaIncassi = totaleIncassi/30;
		System.out.println("Incasso medio giornaliero: "+mediaIncassi);
	

	}

}
