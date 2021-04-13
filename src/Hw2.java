import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.print("2자리수 정수 입력(10~99)>>");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.close();
        if(a / 10 == a % 10)
        {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
            return;
        }
        System.out.println("10의 자리와 1의 자리가 다릅니다.");
     }
}
