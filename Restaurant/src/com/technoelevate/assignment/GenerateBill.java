package com.technoelevate.assignment;

public class GenerateBill {
    GetItems getItems=new GetItems();
    Items[] item=getItems.getListItems();
	public void selectedItems(int[] a) {
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < item.length; j++) {
				if(a[i]==item[j].id) {
					System.out.println(item[j].items);
				}
			}
		}
		
	}
	public void getAmount(int[] a) {
		double amount=0;
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < item.length; j++) {
				if(a[i]==item[j].id) {
					amount+=item[j].price;
				}
			}
		}
		System.out.println(amount);
	}
  
}
