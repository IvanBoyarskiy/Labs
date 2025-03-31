class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name, double oldPrice, double newPrice){
        this.symbol = symbol;
        this.name = name;
        previousClosingPrice = oldPrice;
        currentPrice = newPrice;
    }
    public String getChangePercent(){
        double Percent = (currentPrice - previousClosingPrice) / (previousClosingPrice / 100);
        String returned = Percent + "%";
        return returned;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);
        System.out.print("Изменение цены: " + stock.getChangePercent());
    }
}
