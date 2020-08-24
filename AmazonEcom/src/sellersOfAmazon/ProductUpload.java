package sellersOfAmazon;

public class ProductUpload {

	private String name;
	private String description;
	private Integer price;
	
	public ProductUpload(String name, String description, int price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "ProductUpload [name=" + name + ", description=" + description + ", price=" + price + "]";
	}


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	static int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
