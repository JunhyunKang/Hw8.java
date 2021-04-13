import java.util.Scanner;

/**
 * javadoc 사용 예제를 위한 클래스
 */
public class Hw8 {
    /**
     *사각형 겹침 판정
     * 
     * @param x 입력 x좌표
     * @param y 입력 y좌표
     * @param rectx1
     * @param recty1
     * @param rectx2
     * @param recty2
     * @return
     */
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        int x1 = s.nextInt();
        int y1 = s.nextInt();
        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
            System.out.println("직사각형과 충돌한다.");
    }
}
