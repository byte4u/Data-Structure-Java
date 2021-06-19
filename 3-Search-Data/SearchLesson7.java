/**
 * Search data
 * @author Samadhi
 * @date 2021/06/16
 */
 
public class searchLesson7 {

	public static int search(String data){
		String[] list = {"Bob", "Bruce", "Jennifer", "Kate", "Julie"};
		int arraySyze = 5;
		
        for (int i = 0; i < arraySyze; i++) {
            if (list[i].equals(data)) {
                return i;
            }
        }
        return -1;		
	}
    public static void main(String[] args) {
        System.out.println(search("Bob"));
    }
}
