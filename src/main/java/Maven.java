import org.apache.commons.lang3.StringUtils;
import  com.google.common.math.IntMath;
import java.util.Scanner;

public class Maven extends StringUtils  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = s.nextLine();
        System.out.println("You entered: " + input);
        if (!isNumeric(input)) {
            System.out.println(input + " is not a number");
            System.out.println(swapCase(input));
            System.out.println(reverse(input));
        } else {
            System.out.println(input + " is numeric");
        }
        System.out.println();

    }


}
