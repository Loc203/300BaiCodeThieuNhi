package problems.problem2843;

import javax.sound.midi.MidiFileFormat;
import javax.sound.sampled.FloatControl;

public class problem2843 {
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++){
            if(quantityNum(i)%2==0){
                int temp1 = 0,temp2 = 0;
                int num = i;
                for (int j =0; j<quantityNum(i)/2; j++){
                    if(num<10){
                        temp1 += num;
                        break;
                    }
                    temp1 += num%10;
                    num /= 10;
                }
                for (int j =0; j<quantityNum(i)/2; j++){
                    if(num<10){
                        temp2 += num;
                        break;
                    }
                    temp2 += num%10;
                    num /= 10;
                }
                if (temp1 == temp2) count++;
            }
        }
        return count;
    }

    public static int quantityNum(int num){
        int count = 1;
        if (num/10>0){
            count += quantityNum(num/10);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1,100));
    }

}
