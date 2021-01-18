package _05_class_object.bai_tap.stop_watch;

import java.util.Random;

public class StopWatchMain {
    public static void main(String[]args){
        StopWatch stopWatch = new StopWatch();

        int[] arr = new int[100000];
        Random random = new Random();
        for(int i =0;i<arr.length;i++){
            arr[i] =random.nextInt();
        }
        stopWatch.star();
        int temp = arr[0];
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println("The time to sort the array is: " + stopWatch.getElapsedTime() +" millisecond");

    }
}
