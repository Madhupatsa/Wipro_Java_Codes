package com;

public class Test {
	public static void main(String args[]) {
		Manual obj=new Manual("Mp4");
		obj.showSpec(obj.model);
		AMT ob1=new AMT("AMT5");
		ob1.showSpec(ob1.model);
		Automatic ob2=new Automatic("DVT8");
		ob2.showSpec(ob2.model);
	}
}
