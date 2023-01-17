package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

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
        isExtraCheese=true;
        this.price=this.price+80;
    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppings=true;
        if(isVeg)
        {
            this.price+=70;
        }
        else
        {
            this.price+=120;
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        isPaperBag=true;
        this.price+=20;
    }

    public String getBill()
    {
        // your code goes here
        System.out.println("Base Price Of The Pizza: "+basePrice);
        if(isExtraCheese)
        {
            System.out.println("Extra Cheese Added: 80");
        }
        if(isExtraToppings)
        {
            System.out.print("Extra Toppings Added: ");
            if(isVeg)
            {
                System.out.println("70");
            }
            else {
                System.out.println("120");
            }
        }

        if(isPaperBag)
        {
            System.out.println("Paperbag Added: 20");
        }

        System.out.print("Total Price: ");
        bill=String.valueOf(this.price);
        return "Total Price: "+this.bill;
    }
}
