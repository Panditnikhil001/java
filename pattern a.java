public class PatternA {
    public static void main(String[] args) {
        int t = 1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((j+1)%2);
            }
            System.out.println();
        }
    }
    
}