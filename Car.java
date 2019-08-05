public class Car {
	private String brand;
	private double price;
	
	public Car() {
		brand = "Unknown";
		price = 0.00;
	}
	
	public Car(String newBrand. double newPrice) {
		brand = newBrand;
		setprice = (newPrice);
	}
	public String getBrand(){
		return brand;
	}
	public double getPrice() {
		return price;
	}
	public void setBrand(String newBrand){
		brand = newBrand;
	}
	public void setPrice(double newPrice){
		if (newPrice >=0){
			price = newPrice;
		}
		
	}
	public String toString(){
		return brand + "\t" + price + "\n";
	}
}