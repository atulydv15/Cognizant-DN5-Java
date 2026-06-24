public class Ecommerce {
    public static void main(String[] args) {
        Product p1=new Product(1,"Mobile" );
        Product p2 = new Product(2,"Laptop" );
        Product p3 = new Product(3, "Tablet");

        String ItemToFind="Mobile";
        if(p1.name.equals(ItemToFind)){
            System.out.println("item found");
        }
        if(p2.name.equals(ItemToFind)){
            System.out.println("item found");
        }
        if(p3.name.equals(ItemToFind)){
            System.out.println("item found");
        }
       


    }
}
class Product{
    int price;
    int id;
    String name;
    Product(int id,String name){
        this.id=id;
        this.name=name;
    }
}