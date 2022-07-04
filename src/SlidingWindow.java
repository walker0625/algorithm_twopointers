import java.util.Scanner;

public class SlidingWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] as = new int[a];

        for (int i = 0; i < a; i++) {
            as[i] = sc.nextInt();
        }

        System.out.print(solution(a, b, as));
    }

    private static int solution(int a, int b, int[] as) {
        int answer = 0;
        int sum  = 0;

        for (int i = 0; i < b; i++) {
            sum += as[i];
        }

        answer = sum;

        for (int i = b; i < a; i++) {
            sum +=(as[i] - as[i-b]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

}
