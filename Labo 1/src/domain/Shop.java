package domain;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Shop {
	private static ProductDatabase db;

/*

	public Shop(){
	}

	public double getPrice(String id, int days) {
		return 0;
	}		


	
	public static void addProduct() {
		String title = JOptionPane.showInputDialog("Enter the title:");
		String id = JOptionPane.showInputDialog("Enter the id:");
		String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
		if (type.equals("M")){
			db.add(new Movie(title,id));
		}else if (type.equals("G")) {
			db.add(new Game(title,id));
		}else {
			throw new IllegalArgumentException("Moet M of G zijn");
		}
	}
	
	public static void showProduct(){
		String id = JOptionPane.showInputDialog("Enter the id:");
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < shop.productIds.size() && !found; i++)
		{
			if(shop.productIds.get(i).equals(id))
			{
				idx = i;
				found = true;
			}
		}
		if(found)
		{
			JOptionPane.showMessageDialog(null, shop.productTitles.get(idx));
		}		
	}

	public static void showPrice(Shop shop){
		String id = JOptionPane.showInputDialog("Enter the id:");
		int idx = -1;
		boolean found = false;
		for(int i = 0; i < shop.productIds.size() && !found; i++){
			if(shop.productIds.get(i).equals(id)){
				idx = i;
				found = true;
			}
		}
		if(found){
			String daysString = JOptionPane.showInputDialog("Enter the number of days:");
			int days = Integer.parseInt(daysString);
			JOptionPane.showMessageDialog(null, shop.getPrice(idx,days));
		}
	}
	*/

}
