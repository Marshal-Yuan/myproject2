package com.marshal.sales;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001", 1200);
        Customer c2 = new Customer("002" , 800);
        SliverCustomer c3 = new SliverCustomer("003", 2000);
        c1.print();
        c2.print();
        c3.print();
    }
}
