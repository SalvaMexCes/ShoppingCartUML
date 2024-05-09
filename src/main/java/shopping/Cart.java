package shopping;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;
    private final float TAX = .08f;
    private Special special;


    public Cart(){
        products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }



    @Override
    public String toString() {
        return "Cart {" +
                "Products= " + products +
                '}';
    }

    public Integer cartQty(){
        int x = products.size();
        return x;
    }

    public double subTotal(){
        double total = 0;
        for (Product items : products){
            double price = items.getPrice();
            total += price;
        }
        return total;
    }

    public double totalAfterTax(){
        double total = 0;
        float tax = TAX;
        for (Product product : products){
            double price = product.getPrice();
            total += price;
        }
        return total + (total * tax);
    }

    public void checkOut(){
        System.out.println("Have a great day!!");
    }


    public void checkSaleDay(Special day){
        special = day;
        switch (special){
            case MONDAY:
                System.out.println("5% off!");
                break;
            case TUESDAY:
                System.out.println("7% off!");
                break;
            case WEDNESDAY:
                System.out.println("10% off!");
                break;
            case THURSDAY:
                System.out.println("15% off!");
                break;
            case FRIDAY:
                System.out.println("BUY ONE GET ONE FREE!!");
                break;
            case SATURDAY:
                System.out.println("18% off!");
                break;
            case SUNDAY:
                System.out.println("20% off!");
                break;
        }
    }




}
