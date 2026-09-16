//16 Sept 2026
package Day_5;
import java.util.*;
public class Leetcode2469 {
    public double[] convertTemperature(double celsius) {
        double k = celsius + 273.15;
        double f = (celsius * 1.80) + 32.00;
    
        double[] temp = {k,f};

        return temp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in celsius:");
        double celcius = sc.nextInt();

        Leetcode2469 obj = new Leetcode2469();
        System.out.println(Arrays.toString(obj.convertTemperature(celcius)));
        sc.close();
    }
}
