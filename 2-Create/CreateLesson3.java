import java.util.Arrays;
import java.util.Scanner;

/**
 * Insert records into the array
 *
 * @author Samadhi
 * @version 2.0
 * @date 2021/05/12
 */
 
public class CreateLesson3 {

    public static void create() {
		Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
		int arraySize = scan.nextInt();
        String[] list = new String[arraySize];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Insert the "  + (i + 1) + "st data:");
			list[i] = scan.next();
        }
		System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        create();
    }
}
