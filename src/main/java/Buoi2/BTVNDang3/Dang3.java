package Buoi2.BTVNDang3;

public class Dang3 {

        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            int[] A = {12, 3, 434, 12, 43,55, 434, 38,55,88, 89};
            int[] pos = new int[A.length];
            int len = 1; int maxLength = 1;
            int count = 1;
            pos[count - 1] = 0;

            for (int i = 1; i < A.length; i++) {
                if (A[i] > A[i-1]) {
                    len++;
                    pos[count-1] = i;
                } else {
                    len = 1;
                    if (len == maxLength) {
                        pos[count-1] = i;
                        count++;
                    } else if (len > maxLength) {
                        count = 1;
                        maxLength = len;
                    }

                }

            }

            System.out.println(count);
            System.out.println(maxLength);
            for(int i = 0; i < count; i++ ) {
                System.out.println("Day thu " + (i+1) + " xuat hien o vi tri " + (pos[i]+ 1));
            }
        }
}
