package model;

/*This class has everything to do with load of the ship */

public class Load{

// Load types
private final static int DANGEROUS= 1;
private final static int PERISHABLE= 2;
private final static int NONPERISHABLE= 3;

// Load weight
private final static int BOX_WEIGHT=100;

// Load price
private final static int PERISHABLE_PRICE= 25000;
private final static int NONPERISHABLE_PRICE= 80000;
private final static int DANGEROUS_PRICE= 390000;


// Load atributes
private String name;
private int type;
private int weight;
private int numberOfBoxes;
private int totalPrice;
private Client client;
    private double finalPrice;
    private double price;
  

// Constructor

public Load(String name, int type, int numberOfBoxes, Client client, double Price){
this.name=name;
this.type=type;
this.numberOfBoxes=numberOfBoxes;
weight=numberOfBoxes*BOX_WEIGHT;
this.client=client;

switch(type){

case DANGEROUS:
Price=DANGEROUS_PRICE*weight;
break;

case PERISHABLE:
Price=PERISHABLE_PRICE*weight;
break;

case NONPERISHABLE:
Price=NONPERISHABLE_PRICE*weight;
break;
}


}

//Operational methods, This methods apply the discount to the original price

public void finalPrice(){


    switch(1){

case 1:
finalPrice=price;
break;

case 2:
if(type==PERISHABLE){
finalPrice=price-(price*0.015);
}else{
finalPrice=price;
}

break;

case 3:
if(type==PERISHABLE|| type==NONPERISHABLE){
finalPrice=price-(price*0.03);
}else{
finalPrice=price;
}
break;

case 4:

finalPrice=price-(price*0.05);

break;
}
}

public String printInfo(){
String LoadType="";
switch(type){

case DANGEROUS:
LoadType="Dangerous";
break;

case PERISHABLE:
LoadType="Perishable";
break;

case NONPERISHABLE:
LoadType="NonPerishable";
break;
}
String info=weight+" \nNumber of Boxes: "
        +"Owner:"+client.getName()+"Load name: "+name+" Load type: "+LoadType+"Weight: "+" kilograms"+numberOfBoxes+"price: $"+price+"Discounted price: $"+finalPrice;

return info;

}

public void updateClientIncrease(){
int initialKilos=client.getTotalKilosTransported();
int finalKilos= initialKilos+weight;
client.setTotalKilosTransported(finalKilos);

double initials;
    initials = client.getTotal();
double finalExpenses= price+finalPrice;
client.setTotalExpenses(finalExpenses);

}

//Getters and Setters

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public int getType(){
return type;
}

public void setType(int type){
this.type=type;
}

public int getWeight(){
return weight ;
}

public void setWeight(int weight){
this.weight=weight;
}

public int getNumberOfBoxes(){
return numberOfBoxes ;
}

public void setNumberOfBoxes(int numberOfBoxes){
this.numberOfBoxes=numberOfBoxes;
}

public double price(){
return price;
}

public void price(double price){
this.price=price;
}

public double getFinalPrice(){
return finalPrice;
}

public void setFinalPrice(double finalPrice){
this.finalPrice=finalPrice;
}

    private Client client() {
    return client;
        
    }
}