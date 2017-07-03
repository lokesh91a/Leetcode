
import java.util.*;


/*
 * Complete the function below.
 */
public class Test {

    public static void main(String args[])
    {
        int c=0;
        for(int i=0;i<1000;i++){
            for(int j=i;j<999;j++){
                c++;
            }
        }
        System.out.println(c);
    }
}