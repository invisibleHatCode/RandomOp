package randomop;

import java.util.Random;

public class RandomOp {

    /*
        int lengthAsciiStr = 8;
        //small letter
        randAscii(97,122,lengthAsciiStr);
        //big letter
        randAscii(65,90,lengthAsciiStr);
        //numbers
        randAscii(48,57,lengthAsciiStr);
        //all characters
        randAscii(33,126,lengthAsciiStr);
     */
    public String randAscii(int min, int max, int length) {
        String ret = "";
        int temp = 0;
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            temp = rand.nextInt((max - min) + 1) + min;
            ret += (char) temp;
        }
        return ret;
    }

    public int randIntNumber(int min, int max) {
        int ret = 0;
        Random rand = new Random();
        ret = rand.nextInt((max - min) + 1) + min;
        return ret;
    }

    public double randDouble(double min, double max) {
        Random rand = new Random();
        double randValue = min + (max - min) * rand.nextDouble();
        return randValue;
    }

    public static void main(String[] args) {
        RandomOp rop = new RandomOp();
        
    }

}
