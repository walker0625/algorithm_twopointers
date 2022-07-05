import java.util.Scanner;

public class CountSumCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;

        int maxNum = n/2 + 1;
        int[] arr = new int[maxNum];

        for (int i = 0; i < maxNum; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        int sum = 0;

        for (int rt = 0; rt < maxNum; rt++) {
            sum += arr[rt];
            if(sum == n) {
                answer++;
            }

            while(sum>n) {
                sum-=arr[lt];
                lt++;
                if(sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
}