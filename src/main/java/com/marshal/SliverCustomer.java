package com.marshal;

public class SliverCustomer extends Customer {
    int returnMoney;
    public SliverCustomer(String id, int amount){
        super(id, amount);
    }
    public int getReturnMoney(){
        return (int)(amount*0.1f);
    }

    @Override
    public void print(){
        System.out.print(id + "\t" + amount + "\t" + (amount-getOffMoney())+"("+getReturnMoney()+")");
    }
}
