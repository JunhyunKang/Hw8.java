import java.util.Scanner;

public class Hw6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int a = s.nextInt();
        int ten;
        int unit;
        if((a/10)!=0 && (a/10)%3==0) //2자리
        {
            if((a%10)!=0 && (a%10)%3==0)
            {
                System.out.println("박수짝짝");
                return;
            }
            System.out.println("박수짝");
            return;
        }
        if((a%10)!=0 && (a%10)%3==0)
            System.out.println("박수짝");
    }
}
