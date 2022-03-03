import java.util.*;
    public class Day30_Java_dequeue {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            int[] arr = new int [10000001];
            int n = in.nextInt();
            int m = in.nextInt();
            
            int max = 0;
            int current_uniques = 0;

            for (int i = 0; i < n; i++) {
                if (i >= m){
                    int old = deque.removeLast();
                    if (arr[old] >= 1){
                        arr[old]--;
                        if (arr[old] == 0){
                            current_uniques--;
                        }
                    }
                }
                int num = in.nextInt();
                deque.addFirst(num);
                if(arr[num] == 0){
                    current_uniques++;
                    if(current_uniques == m){
                        System.out.println(current_uniques);
                        return;
                    }
                    max = Math.max(max, current_uniques);
                }
                arr[num]++;
            }
            System.out.println(max);
            in.close();
        }
    }


