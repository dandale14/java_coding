package service;

public class Boat {

    String productName;
    int productPrice;
    int productQuantity;
    String productColour;
    int productId;

    public Boat (String productName,int productPrice,int productQuantity,String productColour , int productId)
    {
      this.productName = productName;
      this.productPrice=productPrice;
      this.productQuantity=productQuantity;
      this.productColour=productColour;
      this.productId=productId;

    }

    public void ProductInformation()
    {
        System.out.println("productcolour :"+this.productColour);
        System.out.println("product name :"+this.productName);
        System.out.println("productID :"+this.productId);
        System.out.println("productprice :"+this.productPrice);

    }

}
