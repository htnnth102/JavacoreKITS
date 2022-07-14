package Buoi2.BTVNDang3;

public class Dang3 {

        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            int[] A = {12, 3, 434, 12, 43, 434, 38,55,88, 99};
            int[] pos = new int[A.length];
            int len = 1;
            int count = 1;
            int index = 0;
            pos[count - 1] = 0;

            for (int i = 1; i < A.length; i++) {
                if (A[i] > A[i-1]) {
                    count++;
                } else {
                    count = 1;
                }
                if (len == count) {
                    pos[count -1] = i;
                    count++;
                } else if (len < count) {
                    pos[count - 1] = i;
                    len = count;
                }
            }
            System.out.println("Max xuat hien o nhung vi tri sau:");
            for (int i = 0; i < count -1 ; i++) {
                System.out.println("Day thu " + (i+1) + " la ");
                for (int j = pos[i]; j < pos[i] + len; j++) {
                    System.out.println(A[j] + " ");
                }
            }
        }
}
