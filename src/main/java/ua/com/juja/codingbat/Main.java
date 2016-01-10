package ua.com.juja.codingbat;

/**
 * Created by serzh on 1/5/16.
 */
public class Main {

    public static void main(String[] args) {

        String s = "kitten";
        System.out.println(has271(new int[]{2, 7, 4}));
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
             result += str.charAt(i);
        }
        return result;
    }


    public static boolean has271(int[] nums) {
        boolean b = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] == 5) {
                if ((nums[i] - nums[i + 2] < 4) && (nums[i] - nums[i + 2] > -2)) {
                    b = true;
                }
            }
        }
        return b;
    }


    public boolean noTriples(int[] nums) {

        boolean b = true;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                b = false;
            }
        }
        return b;
    }


    public int array667(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 6 && (nums[i] == 6 || nums[i] == 7)) {
                count++;
            }
        }
        return count;
    }


    public String stringYak(String str) {
        int index = -1;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("yak")) {
                index = i;
                str = str.substring(0, index).concat(str.substring(index + 3));
            }
        }
        return str;
    }

    public static String altPairs(String str) { //0,1, 4,5, 8,9
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            result = result + str.charAt(i);
            for (int j = i + 1; j < str.length(); ) {
                result = result + str.charAt(i + 1);
                break;
            }
        }
        return result;
    }

}
