package org.mamatha;
import java.io.*;
import java.util.*;    
public class TestProduct
{
        private static Scanner scan;
      public static void main(String[] args) throws Exception {
            scan = new Scanner(System.in);
            List<Product> prod;
            ProductLoader.loadProduct();
            String newtemp = "\n";
            prod = ProductLoader.getProductList();
            System.out.print("Enter the product ID : ");
            String prodID = scan.next();
            Product checkProduct = ProductLoader.searchProduct(prodID);
            if (checkProduct == null) {
                System.out.print("Enter Product Name : ");
                String pnm = scan.next();
                System.out.print("Enter Price : ");
                String pr = scan.next();
                System.out.print("Enter Quantity : ");
                String qt = scan.next();
                newtemp += prodID+","+pnm+","+pr+","+qt;
                TestProduct.addProductData(newtemp);
                ProductLoader.loadProduct();
                System.out.println("\nProduct Added : ");
                checkProduct = ProductLoader.searchProduct(prodID);
                TestProduct.getOutput(checkProduct);
            } else {
                TestProduct.getOutput(checkProduct);
            }
        }





      public static void addProductData(String inputData) throws IOException {
            FileWriter fw = new FileWriter("/JavaPractical/product.txt", true);
            fw.write(inputData);
            fw.close();
        }
        
        public static void getOutput(Product checkProduct) {
            System.out.println("\nProduct ID : " + checkProduct.getProductID());
            System.out.println("Product Name : " + checkProduct.getProductName());
            System.out.println("Price : " + checkProduct.getPrice());
            System.out.println("Quantity : " + checkProduct.getQuantity());
        }

}