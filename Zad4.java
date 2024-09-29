class Shop
{
    String address;
    int size;

    public Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    public String getInformation(){
        return "Address: " + address + ", Size: " + size + "m2";
    }
}
class Bookshop extends Shop
{
    String[] products;

    public Bookshop(String address, int size, String[] products){
        super(address, size);
        this.products = products;
    }

    @Override
    public String getInformation() {
        String productList = String.join(" ," + products);

        return super.getInformation() + ", Products: " + productList;
    }
}
class Bakery extends Shop
{
    String[] products;
    public Bakery(String address, int size, String[] products){
        super(address, size);
        this.products = products;
    }
    @Override
    public String getInformation() {
        String productList = String.join(", " + products);

        return super.getInformation() + ", Products: " + productList;
    }
}

public class Zad4 {
    public static void main(String[] args){
        String[] bookshopProducts = {"Books", "Magazines", "Comics"};
        String[] bakeryProducts = {"Bread", "Cakes", "Pastries"};

        Bookshop bookshop = new Bookshop("miszor 2137", 80, bookshopProducts);
        Bakery bakery = new Bakery("kiara 420", 50, bakeryProducts);

        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
