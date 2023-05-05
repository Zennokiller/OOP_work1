package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    /** Вместимость вендинговой машины */
    private int volume;
    /** Список продуктов */
    private List<Product> products;// = new ArrayList<Product>();
    /** Лог работы */
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    /** Добавление продукта */
    public void addProduct(Product prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }

    public Product getProdByName(String name)
    {
        for(Product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll()
    {
        return products;
    }

}