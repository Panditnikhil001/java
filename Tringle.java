public class Tringle {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i==0 || i==3 || i==j)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}