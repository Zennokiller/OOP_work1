package Products;

public class HotDrink extends Product {
    /** Переменная хранящаю температуру */
    private int temperatute;

    /** Конструктор HotDrink*/
    public HotDrink(String name, double price, int temperatute) {
        super(name, price);
        this.temperatute = temperatute;
    }

    public int getTemperature() {
        return temperatute;
    }

    public void setTemperature(int temperatute) {
        this.temperatute = temperatute;
    }
    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", temperature=" + temperatute + "C" +
        '}';
    }


    
}
