import java.util.*;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {

//        ArrayList<Product> product = MainpageService.showAllProduct();
//        for(Product e : product){
//            System.out.println(e.getId());
//            
//        }
        
    
        
}
    static void getinfo(){
        ArrayList<Product> product = MainpageService.showAllProduct();
        int i=0;
        for(Product e : product){
            Product product1 = MainpageService.getProduct(e.getId());
            if (i == 0) {
                MainPage.x10.setText(product1.getName().toUpperCase());
               // MainPage.x2.setText(""+product1.getPicture());
            } else if (i == 1) {
                MainPage.x11.setText(product1.getName().toUpperCase());
            } else if (i == 2) {
                MainPage.x12.setText(product1.getName().toUpperCase());
            } else if (i == 3) {
                MainPage.x13.setText(product1.getName().toUpperCase());
            } else if (i == 4) {
                MainPage.x14.setText(product1.getName().toUpperCase());
            } else if (i == 5) {
                MainPage.x15.setText(product1.getName().toUpperCase());
                break;
            }
        //MainPage.x1.setText(""+product1.getImage());
            i++;
        }
         
    }
}
