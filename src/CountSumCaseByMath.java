import java.util.Scanner;

public class CountSumCaseByMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int cnt = 1; // 더하는 숫자의 갯수 & 연속된 자연수(1, 2, 3)

        n--;

        while(n > 0) {
            cnt++;
            n = n - cnt;

            if(n%cnt==0) { // 나누어 떨어지면 같은 수를 분배하면 됨
                answer++;
            }

        }

        return answer;
    }
}