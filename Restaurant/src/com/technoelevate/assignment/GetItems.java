package com.technoelevate.assignment;

public class GetItems {
	 Items[] listItem=new Items[10];
	 Items item1=new Items(1,"Chapathi",35.6);
	 Items item2=new Items(2,"FriedRice",80.0);
	 Items item3=new Items(3,"Roti",40);
	 Items item4=new Items(4,"GheeRice",90);
     Items item5=new Items(5,"Poori",35);
     Items item6=new Items(6,"KajuMasala",150.0);
     Items item7=new Items(7,"PaneerMasala",125.0);
     Items item8=new Items(8,"KurmaBaaji",90.0);
     Items item9=new Items(9,"ChickenMasala",160.0);
     Items item10=new Items(10,"Paratha",40.0);
	 void createItem() {
		listItem[0]=item1;
		listItem[1]=item2;
		listItem[2]=item3;
		listItem[3]=item4;
		listItem[4]=item5;
		listItem[5]=item6;
		listItem[6]=item7;
		listItem[7]=item8;
		listItem[8]=item9;
		listItem[9]=item10;	
		}
	 void displayItem() {
		 for(int i=0;i<listItem.length;i++) {
			 System.out.println(listItem[i].id+" "+listItem[i].items+"(Rs "+listItem[i].price+")");
			 System.out.println();
		 }
	 }
	 
	 Items[] getListItems() {
		 createItem();
		 return listItem;
}
}
	 

