/**
 * Search data
 * @author Samadhi
 * @date 2021/05/15
 */
 
public class searchLesson5 {

	public static String search(int position){
		String[] list = {"Bob", "Bruce", "Jennifer", "Kate", "Julie"};
		int arraySyze= 5;
		if (!(position >= 0 && position < arraySyze)) {
            throw new IllegalArgumentException("Invalid position");
        }
        return list[position];	
	}
    public static void main(String[] args) {
        System.out.println(search(4));
    }
}
