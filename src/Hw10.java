import java.util.Scanner;

public class Hw10 {
    public static int calculateDistance(int x1, int y1, int x2, int y2){
        int distance;
        distance = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
        return distance;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1,y1,x2, y2, r1, r2;
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        x1 = s.nextInt();
        y1 = s.nextInt();
        r1 = s.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        x2 = s.nextInt();
        y2 = s.nextInt();
        r2 = s.nextInt();

        int d = calculateDistance(x1,y1,x2,y2);

        if(d<(r1+r2)*(r1+r2))
        {
            System.out.println("두 원은 서로 겹친다.");
        }
        s.close();
    }
}
