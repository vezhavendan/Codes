package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("companyname");
	}
	public void companyAddress() {
		System.out.println("companyaddress");
	}
	public void Companyid() {
		System.out.println("companyid");
	}
	
	public static class CompanySecret{
		
	public void companyshare() {
		System.out.println("companyshare");
		
	}


	public static void main(String[] args) {
		CompanyInfo company=new CompanyInfo();
		CompanySecret secret=new CompanySecret();
		company.companyName();
		company.companyAddress();
		company.Companyid();
		secret.companyshare();
	}


	}

}
