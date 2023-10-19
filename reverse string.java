import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String name = sc.nextLine();

        StringBuffer name1 = new StringBuffer("hello java");
        System.out.println(name1.reverse());

        StringBuilder name2 = new StringBuilder("learn java");
        System.out.println(name2.reverse());

        String m = "";
        int l = name.length();
        for (int i = l - 1; i >= 0; i--) {
            m = m + name.charAt(i);
        }
        System.out.println(m);
    

    }
    
}