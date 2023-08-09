package com.overloading.app;

public class MarketKiller {

	public static void main(String[] args) {
		Market market = new Market();
		market.purchase();
		market.purchase(5.5);
		market.purchase(10);
		market.purchase("TOMATO");
		market.purchase("TOMATO", 120.6);
		market.purchase("TOMATO", 10);

		System.out.println("\n,,,,,,,,,override with parent ref,,,,,,,,,,,,,,\n");

		Market market2 =new MarketShop();
		market2.purchase();
		market2.purchase(5.5);
		market2.purchase(10);
		market2.purchase("POTATO");
		market2.purchase("POTATO", 120.6);
		market2.purchase("POTATO", 10);

		System.out.println("\n,,,,,,,,,override with SUB ref,,,,,,,,,,,,,,\n");

		MarketShop market3 = new MarketShop();
		market3.purchase();
		market3.purchase(5.5);
		market3.purchase(10);
		market3.purchase("CARROT");
		market3.purchase("CARROT", 120.6);
		market3.purchase("CARROT", 10);

	}

	}


