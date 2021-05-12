import java.util.Arrays;

/**
 * Insert records into the array
 *
 * @author Samadhi
 * @version 1.0
 * @date 2021/05/11
 */
 
public class CreateLesson2 {

    public static void create() {
        String[] list = new String[3];
        list[0] = "Bob";
		list[1] = "Michael";
		list[2] = "Abraham";
		System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        create();
    }
}
