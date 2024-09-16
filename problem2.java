import java.util.Scanner;
class problem2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int redius;
redius = input.nextInt();
double area = (3.1416*redius*redius);
double perimeter = (2*3.1416*redius);
System.out.println("AREA : "+area);
System.out.println("PERIMETER : "+perimeter);
}
}
