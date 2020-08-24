package sellersOfAmazon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ManageProducts {
	
	LinkedList<ProductUpload> products;

	
	public boolean showProducts()
	{
		boolean check = false;
		if(products.size() == 0 || products == null)
		{
			 check = false;
		}
		else if(products.size()>0)
		{
			Iterator<ProductUpload> itr = products.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			check =  true;
		}
		return check;
	}
	
	public boolean addProduct(ProductUpload p)
	{
		return products.add(p);
	}
	
	public boolean deleteProduct(String productName)
	{
		ArrayList<ProductUpload> p = new ArrayList<ProductUpload>(products);
		int i = 0;
		while(i<p.size())
		{
			if(p.get(i).getName().equalsIgnoreCase(productName))
			{
				p.remove(i);
				return true;
			}
		}
		return false;
	}
	

}
