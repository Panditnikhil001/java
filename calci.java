import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values ");
        float num1=sc.nextFloat();
        float num2=sc.nextFloat();
        System.out.println("1.addition \n 2.subtraction \n 3.mul \n 4.div");
        int opr=sc.nextInt();
        switch(opr){
            case 1:System.out.println("addition is"+(num1+num2));
            break;
             case 2:System.out.println("subtraction is"+(num1-num2));
            break;
             case 3:System.out.println("mul is"+(num1*num2));
            break;
             case 4:System.out.println("div is"+(num1/num2));
            break;
            default:
            System.out.println("you have enter wrong operation");
        }
        
    }
    
}