package prinPatrDis.A01_Encapsula;

import java.util.ArrayList;

public class Order2 {
	private ArrayList<Item> items = new ArrayList<>();
	private String country;
	private Impuesto imp;

	public Order2(String country) {
		this.country = country;
		imp = new Impuesto(this.country);
	}

	public double getTotal() {
		double total = 0;

		for (Item item : items) {
			total += item.getPrice() * item.getQuantity();
		}
		total += total * imp.getImpuesto();

		return total;
	}

	public double getImpuesto() {

		return 0;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public Impuesto getImp() {
		return imp;
	}

	public void setImp(Impuesto imp) {
		this.imp = imp;
	}
}
