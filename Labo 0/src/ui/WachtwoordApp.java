package ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class WachtwoordApp {

	public static void main(String[] args) {
		//array met 5 usernamen
		String [] userNames_a = {"u1234567", "u7654321", "u1122334", "u1212123", "u4443332"};
		List <String> userNames = new ArrayList<>(Arrays.asList(userNames_a));
		Map <String, List<String>> wachtwoorden= new HashMap<>();
	    for (String userName:userNames) {
	    	wachtwoorden.put(userName,new LinkedList<String>());
	    }
	    //deel1   
	    //ingeven van paswoorden van users
	    Scanner scanner = new Scanner(System.in);
	    String userName = "";
	    System.out.println("Typ usernaam om paswoord te setten/veranderen (* = stoppen)");
        userName = scanner.nextLine();
	    while (!userName.equals("*")) {	
	        if (!wachtwoorden.containsKey(userName))
	        	System.out.println("user niet gevonden gevonden");
	        else {
	        	List <String> wachtwoordenUser = wachtwoorden.get(userName);
	        	System.out.println("Typ paswoord");
	             String nieuwWachtwoord = scanner.nextLine();
	             if (!wachtwoordenUser.contains(nieuwWachtwoord)) {
	             	wachtwoordenUser.add(nieuwWachtwoord);
	             	System.out.println("nieuw paswoord toevoegen gelukt");	             		             			
	             }
	             else {
	             	System.out.println("nieuw paswoord toevoegen niet gelukt");
	             }	             	
	        }
	        System.out.println("Typ usernaam om paswoord te setten/veranderen (* = stoppen)");
	        userName = scanner.nextLine();
	    }        	
	    scanner.close();
	    //lijst van alle paswoorden per user 
	    System.out.println("Lijst van wachtwoorden per user\n"+wachtwoorden.toString());
	    
	    
	    //deel2
	    //lijst van alle paswoorden van alle users geordend van langste naar kortste paswoord en bij gelijek lengte oplopend alfabetisch    
	    Collection<List<String>> deWachtwoorden = wachtwoorden.values();
	    Set <String> wachtwoordenGeordend = new TreeSet<>(new WachtwoordComparator());
	    for (List<String> wachtwoordenEenUser:deWachtwoorden) {
	        wachtwoordenGeordend.addAll(wachtwoordenEenUser);
	    }
	    System.out.println("Lijst van alle ingegeven wachtwoorden geordend van lang naar kort\n"+wachtwoordenGeordend.toString());	        
	}
}