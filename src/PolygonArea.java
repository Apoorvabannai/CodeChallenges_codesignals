
import java.util.Scanner;
public class PolygonArea {


    static int shapeArea( int n ){
        int area  = 1;
        for( int i = 1; i<=n; i++){
            area += i*4;
        }
        return area;
    }
     public static void main(String [] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter the value of n");
          int n = sc.nextInt();

           System.out.println(shapeArea(6));
     }
}

