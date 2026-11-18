//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    String[] products = {"Cozy Nights Monarc mattress", "Sealy Phuket matress"};
    int[][] sales = new int[3][3];

    for (int i = 0; i < products.length; i++) {
        for (int month = 0; month < 3; month++) {

            System.out.println("ENTE number of sales for month" + (month + 1) + " for " + products[i] + ":");
            sales[i][month] = scanner.nextint();
        }
    }
    Product product = new product(products, sales);
    PrintProduct printer = new PrintProduct();

    System.out.println("***************************************************************");

    printer.PrintTotalProductSales(product);
    printer.PrintAverageProductSales(product);
    printer.PrintMostPopularProduct(product, products, sales);

    scanner.close();
     }

}






