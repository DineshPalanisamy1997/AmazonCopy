package sellersOfAmazon;

public class SignUp {
	private String sellerName;
	private String emailID;
	private String password;
	private String GST;
	private String mobile;
	
	public SignUp(String sellerName, String emailID, String password, String gST, String mobile) {
		this.sellerName = sellerName;
		this.emailID = emailID;
		this.password = password;
		this.GST = gST;
		this.mobile = mobile;
	}
	
	public SignUp() {};
	
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGST() {
		return GST;
	}
	public void setGST(String gST) {
		GST = gST;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "SignUp [sellerName=" + sellerName + ", emailID=" + emailID + ", password=" + password + ", GST=" + GST
				+ ", mobile=" + mobile + "]";
	}

	
	
}
