package org.mamatha;
import java.io.*;
import java.util.*;

class ProductLoader{
    private static List<Product> lp= new ArrayList<>();
    
    public static void loadProduct() throws Exception {
        
        BufferedReader bf = new BufferedReader(new FileReader(new File("C:\\Users\\mamatha.k\\eclipse-workspace\\Happiestminds\\src\\org\\mamatha\\Product.txt")));
        
        String line;
        while((line=bf.readLine())!=null)
        {
            String arr[] = line.split(",");
            Product pp = new Product(arr[0],arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3]));
           lp.add(pp);
        }
    }
    public static List<Product> getProductList(){
        return lp;
    }
    
    public static Product searchProduct(String productID)
    {
        List <Product> temp_lt = getProductList();
        for(Product p : temp_lt)
        {
            if(p.productID.equals(productID) )
            {
                return p;
            }
        }
        return null; 
    }
}


