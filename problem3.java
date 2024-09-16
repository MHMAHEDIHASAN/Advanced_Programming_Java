import java.util.Scanner;
class problem3{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int num1,num2;
num1 = input.nextInt();
num2 = input.nextInt();
System.out.println("BEFORE");
System.out.println("NUMBER1 : "+num1);
System.out.println("NUMBER2 : "+num2);
num1 = num2+num1;
num2 = num1-num2;
num1 = num1-num2;
System.out.println("AFTER");
System.out.println("NUMBER1 : "+num1);
System.out.println("NUMBER2 : "+num2);
}
}
