package sellersOfAmazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SupplierBoardTest {

	private static Scanner in = new Scanner(System.in);
	private static ArrayList<SignUp> Suppliers = new ArrayList<SignUp>();
	private static Map<SignUp, List<ProductUpload>> SupplierAndProducts = new HashMap<>();

	
	public static void main(String[] args) {
		while (true) {
			printOptions();
			int choice = in.nextInt();

			switch (choice) {
			case 1:
				SignUp x = printSignUpForm();
				Suppliers.add(x);
				int i = 0;
				while (i < Suppliers.size()) {
					System.out.println(Suppliers.get(i).toString());
					i++;
				}
				break;

			case 2:
				SignIn y = printSignInInfo();
				y.addSeller(Suppliers);
				boolean isCorrect = y.clickLoginBtn();
				if (isCorrect) {
					System.out.println("enter the products count :");
					int productCount = in.nextInt();
					System.out.println(y.email);
					i = 0;
					while (i < Suppliers.size()) {
						if (Suppliers.get(i).getEmailID().equals(y.email)) {
							SupplierAndProducts.put(Suppliers.get(i), new LinkedList<ProductUpload>());
							if(SupplierAndProducts.containsKey(Suppliers.get(i)))
							{
								int v = 0;
									 for ( List<ProductUpload> d: SupplierAndProducts.values() ) {
										if(v == i)
										{
											d.addAll(uploadProducts(productCount));
										}
									}
							}
								
							}
						}
						i++;
					}
					
					System.out.println(SupplierAndProducts);
				}
			
			
		}
	}

	public static void printOptions() {
		System.out.println("WELCOME TO SUPPLIER SITE\nchoose the option : \n" + "1.Sign-Up\n" + "2.Sign-in");
	}

	public static SignUp printSignUpForm() {
		System.out.println("enter the following details,");
		String[] requiredDetails = { "sellerName", "email", "password", "GST", "mobile" };
		String[] data = new String[requiredDetails.length];
		int i = 0;
		for (String string : requiredDetails) {
			System.out.println("enter the " + string + ":");
			data[i] = in.next();
			i++;
		}
		return new SignUp(data[0], data[1], data[2], data[3], data[4]);
	}

	public static SignIn printSignInInfo() {
		System.out.println("enter the email:");
		String email = in.next();
		System.out.println("enter the password:");
		String password = in.next();
		SignIn login = new SignIn(email, password);
		return login;
	}

	public static LinkedList<ProductUpload> uploadProducts(int productCount) {

		LinkedList<ProductUpload> products = new LinkedList<>();
		if (productCount == 0)
			System.out.println("enter the valid count");
		while (productCount > 0) {
			System.out.println("enter the product name");
			String name = in.next();
			System.out.println("enter the description");
			String desc = in.next();
			System.out.println("enter the price");
			in.nextLine();
			Integer price = in.nextInt();
			products.add(new ProductUpload(name, desc, price));
			productCount--;
		}
		return products;
	}
}
