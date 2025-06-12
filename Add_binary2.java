import java.util.Scanner;
public class Add_binary2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first binary number ");
        String binary1=input.next();
        System.out.println("enter second binary number ");
        String binary2=input.next();
        
      int num1=   Integer.parseInt(binary1,2);
      int num2=   Integer.parseInt(binary2,2);
      int sum=num1+num2;

      String binarystr=Integer.toBinaryString(sum);
      System.out.println("sum of binary is "+binarystr);
    }
}
