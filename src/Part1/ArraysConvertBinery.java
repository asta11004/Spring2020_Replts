package Part1;

import java.util.Scanner;

public class ArraysConvertBinery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        //TODO: Write your code below.

        int[] arr = {128,64,32,16,8,4,2,1};

        int i = 0;
        int sum = 0;
        while(i<8){
            if(binary[i]==1){
                sum += arr[i];
            }
            i++;
        }
        System.out.println(sum);

    }
}
