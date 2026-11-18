public class Product implements IProduct {
    private String[]products;
    private int[][] sales; // [product][month]

    //we are storing the data (constructor)
    public Product(String[] products,int[][] sales){
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = sales.length* sales[0].length; // 3 times 3 = 9
        return (double) total/count;
    }

    @Override
    public String GetMostPopularProduct() {
        int topIndex = 0;
        int highest = -1;

        for(int i =0; i<sales.length; i++){
            int productTotal = 0;
            for(int j = 0; j<sales[i].length; j++){
                productTotal = productTotal + sales[i][j];
            }
            if (productTotal > highest){
                highest = productTotal;
                topIndex = i;
            }
        }
        return products[topIndex];
    }
  // this method helps PrintProduct to get total of one product

    public int getSingleProductTotal(int index){
        int total = 0;
        for(int j = 0; j<sales[index].length; j++){
            total = total + sales[index][j];
        }
        return total;
    }
}




