import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String input = scanner.nextLine();
        int count = countVietnameseLetters(input);
        System.out.println("Số lượng chữ cái Tiếng Việt có thể tạo thành trong chuỗi: " + count);
	}
	public static int countVietnameseLetters(String input) {
        int count = 0;
        Set<String> vietnameseLetters = new HashSet<>(Arrays.asList("aw", "aa", "dd", "ee", "oo", "ow", "w"));

        for (int i = 0; i < input.length() - 1; i++) {
            String twoChars = input.substring(i, i + 2);
            if (vietnameseLetters.contains(twoChars)) {
                count++;
                i++; 
            }
        }
        return count;
    }
}