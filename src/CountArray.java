import java.util.Scanner;

public class CountArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, t, arr));
    }

    private static int solution(int n, int t, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum+=arr[rt];
            if(sum==t) {
                answer++;
            }
            while(sum>t) {
                sum-=arr[lt];
                lt++;
                if(sum==t) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
