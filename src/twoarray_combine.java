import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class twoarray_combine {

    private static List<Integer> solution(int a, int[] a1, int b, int[] b1) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while(p1 < a && p2 < b) {
            if(a1[p1] < b1[p2]) {
                answer.add(a1[p1++]);
            } else {
                answer.add(b1[p2++ ]);
            }
        }

        while(p1 < a) {
            answer.add(a1[p1++]);
        }

        while(p2 < b) {
            answer.add(b1[p2++]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] a1 = new int[a];

        for (int i = 0; i < a; i++) {
            a1[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] b1 = new int[b];

        for (int i = 0; i < b; i++) {
            b1[i] = sc.nextInt();
        }

        for (int i : solution(a, a1, b, b1)) {
            System.out.print(i + " ");
        }
    }

}
