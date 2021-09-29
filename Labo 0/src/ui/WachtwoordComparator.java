package ui;

import java.util.Comparator;

public class WachtwoordComparator implements Comparator<String>{

	@Override
	public int compare(String arg0, String arg1) {
		int verschil = arg1.length() - arg0.length();
		if (verschil != 0) return verschil;
		return arg0.compareTo(arg1);		
	}
}