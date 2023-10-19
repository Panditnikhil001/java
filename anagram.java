import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two strings");
        String str1 = sc.next();
        String str2 = sc.next();
        char c1[] = str1.toCharArray();
        char c2[] = str2.toCharArray();
        if (c1.length != c2.length) {
            System.out.println("not anagram");
            System.exit(0);
        }

        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("not anagram");
                System.exit(0);
            }
        }
        System.out.println("anagram");
        sc.close();
        
    }

}