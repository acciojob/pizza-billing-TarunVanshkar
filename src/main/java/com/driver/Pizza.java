package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";    // set as blank otherwise null will be printed

    private boolean isExtraCheese;
    private boolean isExtraToppings;
    private boolean isPaperBag;

    private int basePrice;
    private int toppingsPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
        basePrice=this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese)
        {
            this.price=getPrice()+80;
            isExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraToppings)
        {
            if(isVeg)
            {
                this.price=getPrice()+70;
            }
            else
            {
                this.price=getPrice()+120;
            }
            isExtraToppings=true;
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        if(!isPaperBag)
        {
            this.price=getPrice()+20;
            isPaperBag=true;
        }
    }

    public String getBill()
    {
        // your code goes here
        bill+="Base Price Of The Pizza: "+basePrice+"\n";       // "\n"--> to change to new line
        if(isExtraCheese)
        {
            bill+="Extra Cheese Added: 80"+"\n";
        }
        if(isExtraToppings)
        {
            if(isVeg)
            {
                bill+="Extra Toppings Added: 70"+"\n";
            }
            else
            {
                bill+="Extra Toppings Added: 120"+"\n";
            }
        }
        if(isPaperBag)
        {
            bill+="Paperbag Added: 20"+"\n";
        }

        bill+="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
