package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String ortaMetin = "İlginizi çekeblir.";
				
		System.out.println(ortaMetin);
		
		double dolarDun= 18.20;
		double dolarBugun= 18.21;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun){
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		String [] krediler = {"Hızlı Krediler", "Maaşını Halkbanktan", "Mutlu Emekli","Hızlı Krediler", "Maaşını Halkbanktan", "Mutlu Emekli"};
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
