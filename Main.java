package com.company;

public class Main {

    public static void main(String[] args) {
	IBoutiqueFactory factory=new GucciFactory();
	IBags bags=factory.makeBags();
	bags.intro();

	factory=new ChanelFactory();
	bags=factory.makeBags();
	bags.intro();

	factory=new GucciFactory();
	IJewelry jewelry=factory.makeJewelry();
	jewelry.jewelryIntro();

    }
}
