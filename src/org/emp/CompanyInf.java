package org.emp;

public class CompanyInf {
public void companyName() {
	System.out.println("CompanyName");
}
public void companyName(double a,double b) {
	System.out.println("a+b");
}
public void companyName(float a,float b) {
	System.out.println("a+b");
}
public void companyName(String a,double b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	CompanyInf c = new CompanyInf();
	c.companyName();
	c.companyName(381.54d, 369.69d);
	c.companyName(75.2,85.2);
		
	c.companyName("Vignesh", 38169);
}


	
	

}

