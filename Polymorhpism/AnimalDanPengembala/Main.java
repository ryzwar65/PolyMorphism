public class Main{
	public static void main(String[] args) {
		int i;
		Main m = new Main();
		Kambing kambing = new Kambing();
		Ayam ayam = new Ayam();
		Sapi sapi = new Sapi();
		Pengembala gembala = new Pengembala();
		HewanTernak ht[]={kambing,ayam,sapi};
		for (i=0;i<ht.length;i++ ) {
			gembala.menyapa(ht[i]);	
			gembala.setMendengar();
		}
		int angka = 100;
		HewanTernak ternak;
		ternak = new Ayam();
		System.out.println("Ayam Ngendog : "+((Ayam)ternak).bertelur(angka));
	}
}