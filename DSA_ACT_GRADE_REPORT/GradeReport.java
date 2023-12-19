package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class aaa

{

        public static void main(String[] args) {
        String[][] cabinet2 = {{"gadgets", "pliers"}, {"documents", "CDs"}, {"manuals", "candies"}}; int layer, sub;
        for(layer = 0; layer < cabinet2.length; layer++)
        {
        for(sub = 0; sub < cabinet2[layer].length; sub++)
        {
        System.out.println("Layer " + layer + " and " + "sub" + sub + " has " + cabinet2[layer][sub]);
        }
        System.out.println();
        }
   
 }
}