
public class AutoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		auto1.merkki = "Toyota";
		auto1.malli = "Corolla";
		auto1.bensanMaara = 50;
		
		auto1.naytaTiedot();
		auto1.kiihdytä();
		auto1.naytaTiedot();
		
		Auto auto2 = new Auto("Volkswagen", "Golf", 60);
		auto2.naytaTiedot();
		
		Auto auto3 = new Auto();
		auto3.naytaTiedot();

	}

}

class Auto {
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto() {
		merkki = "Lada";
		malli = "1200";
		bensanMaara = 5;
	}
	
	public Auto(String merkki, String malli, int bensa) {
		this.merkki = merkki;
		this.malli = malli;
		bensanMaara = bensa;
	}
	
	public void jarruta() {
		System.out.println("Auto jarruttaa.");
	}
	
	public void kiihdytä() {
		if (bensanMaara > 0) {
		System.out.println("Auto kiihtyy.");
		bensanMaara--;
		}
	}
	
	public void naytaTiedot() {
		System.out.println(merkki + " " +malli + "\n" + "Bensan määrä " + bensanMaara);
	}
	
	public void tankkaa(int maara) {
		System.out.println("Tankissa bensaa: " + bensanMaara);
		System.out.println("Tankkaus: " + maara);
		bensanMaara += maara;
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
	}
}