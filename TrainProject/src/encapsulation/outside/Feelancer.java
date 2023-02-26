package encapsulation.outside;

import encapsulation.inside.Company;

public class Feelancer {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "c123";
		company.name = "n234";
//		default || protected >> chi goi duoc trong cung pakage
//		company.insurance = "2345";
//		company.fund >> private 
	}
}
