import java.util.Scanner;

public class Hw12_1 {
    public static void main(String[] args) {
        double a;
        String o;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        a = scanner.nextDouble();
        o = scanner.next();
        b = scanner.nextDouble();

        if(o.equals("+"))
        {
            System.out.println(a+ o +b+"의 계산 결과는 "+(a+b));
        }

        if(o.equals("-"))
        {
            System.out.println(a+ o +b+"의 계산 결과는 "+(a-b));
        }

        if(o.equals("*"))
        {
            System.out.println(a+ o +b+"의 계산 결과는 "+(a*b));
        }

        if(o.equals("/"))
        {
            if(b==0)
            {
                System.out.println("0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }
            System.out.println(a+ o +b+"의 계산 결과는 "+(a/b));
        }
        scanner.close();
    }
}
