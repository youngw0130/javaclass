package problem;

public class Exercise5_5 {
    public static void main(String[] args) {
        int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
        for (int i = 0; i < ballArr.length; i++) {
            int j = (int) (Math.random() * ballArr.length);
            int temp = 0;
            temp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = temp;
        }
        for(int i=0;i<3;i++) {
            ball3[i]=ballArr[i];
        }
        for (int i = 0; i < ball3.length; i++) {
            System.out.print(ball3[i]);
        }
    }
}
