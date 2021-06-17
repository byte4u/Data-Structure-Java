/**
 * Search data
 * @author Samadhi
 * @date 2021/05/17
 */
 
public class SearchLesson6 {

	public static boolean search(String data){
		String[] list = {"Bob", "Bruce", "Jennifer", "Kate", "Julie"};
		int arraySyze = 5;
		
        for (int i = 0; i < arraySyze; i++) {
            if (list[i].equals(data)) {
                return true;
            }
        }
        return false;		
	}
    public static void main(String[] args) {
        System.out.println(search("Bob"));
    }
}
