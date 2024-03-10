import Domain.Bottle;
import Domain.Product;
import Service.CoinDispencer;
import Service.Display;
import Service.Holder;
import Service.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello");
        Product item1 = new Product(100.0, 1, "lays");
        Product item2 = new Product(80.0, 2, "nuts");
        Product item3 = new Product(40.0, 3, "mars");
        Product item4 = new Bottle(14.5, 4, "Cola", 0.5f);
        Product item5 = new Bottle(20.5, 5, "Mineral", 0.5f);

        List<Product> products = new ArrayList<>();
        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);
        products.add(item5);

        Holder hold = new Holder();
        CoinDispencer coin = new CoinDispencer();
        Display display = new Display();
        VendingMachine vendingMachine = new VendingMachine(hold, coin, display, products);

        for (Product prod : vendingMachine.getListProduct()){
            System.out.println(prod);
        }

        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }


}
