public class PrintProduct {
    public void PrintTotalProductSales(Product product) {
        System.out.println(" TOTAL PRODUCT SALES:" + product.GetTotalProductsSold());
    }

    public void PrintAverageProductSales(Product product) {
        System.out.println(" AVERAGE PRODUCT SALES:" + (double v = product.GetAverageProductSold();
        int);product.GetAverageProductSold(); {
        }
        public void PrintMostPopularProduct (Product product, String[] products,int[][] sales){
            String mostPopular = product.GetMostPopularProduct();
            // the total must print (63)
            int total = 0;
            for (int i = 0; i < products.length; i++) {
                if (products[i].equals(mostPopular)) {
                    total = product.getSingleProductTotal(i);
                }
            }
            System.out.println(" MOST POPULAR PRODUCT:" + mostPopular +" (+ TOTAL +") ;
        }
    }
}
