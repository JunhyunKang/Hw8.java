import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        System.out.print("정수 3개 입력>>");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        long x = a-b;
        long y = b-c;
        long z = c-a;

        if(x*y>0)
            System.out.println("중간 값은 "+b);
        if(x*z>0)
            System.out.println("중간 값은 "+a);
        if(y*z>0)
            System.out.println("중간 값은 "+c);
        s.close();
    }
}
