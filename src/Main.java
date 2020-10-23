import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] someArrayRunning = runningSum(new int[]{3,1,2,10,1});
        System.out.println(Arrays.toString(someArrayRunning));
    }
    public static int[] runningSum(int[] num) {
        int[] runningArrays = new int[num.length];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            num[i] = sum;
        }
           return num;
        }
    }
