package sellersOfAmazon;

import java.util.*;

public class SignIn{
	ArrayList<SignIn> signInValue;
	String email;
	String password;
	ArrayList<SignUp> sellerInfo;
	
	public SignIn(String email, String password) {
		this.email = email;
		this.password = password;
		 sellerInfo = new ArrayList<SignUp>();
	}
	
	public void addSeller(List<SignUp> x) {
		sellerInfo = (ArrayList<SignUp>) x;
	};
	
	public boolean clickLoginBtn()
	{
		boolean check = false;
		int i = 0;
		while(i<sellerInfo.size())
		{
			if(this.email.equals(sellerInfo.get(i).getEmailID()) && this.password.equals(sellerInfo.get(i).getPassword()))
			{
				System.out.println("login successfull");
				check =  true;
				break;
			}
			i++;
		}
		if(i == sellerInfo.size())
		{
			System.out.println("incorrect mailID or Password");
			check =  false;
		}
		return check;
			
	}

}
