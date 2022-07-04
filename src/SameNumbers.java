import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SameNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] as = new int[a];

        for (int i = 0; i < a; i++) {
            as[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] bs = new int[b];

        for (int i = 0; i < b; i++) {
            bs[i] = sc.nextInt();
        }

        for (int x  : solution(a, b, as, bs)) {
            System.out.print(x + " ");
        }
    }

    private static List<Integer> solution(int a, int b, int[] as, int[] bs) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(as);
        Arrays.sort(bs);

        int p1 = 0;
        int p2 = 0;

        while (p1 < a && p2 < b) {
            if(as[p1] == bs[p2]) {
                answer.add(as[p1]);
                p1++;
                p2++;
            } else if(as[p1] > bs[p2]) {
                p2++;
            } else {
                p1++;
            }
        }

        return answer;
    }
}
