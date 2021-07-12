package javafactory;

import phone.android;
import phone.factoryobject;
import phone.osinterface;

public class factorymain {

	public static void main(String[] args) {
	factoryobject f1=new factoryobject();
	osinterface obj=f1.getinstance("open");
	obj.ostype();

	}

}
