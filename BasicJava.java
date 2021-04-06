import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * BasicJava
 */
public class BasicJava {

    public void print1To255() {
        for (var i = 1; i < 256; i++) System.out.println(i);
    }

    public void printOdd1To255() {
        for (var i = 1; i < 256; i++) {
            if (i % 2 != 0) System.out.println(i);
        }
    }

    public void printSums() {
        int sum = 0;
        for (var i = 0; i < 256; i++) {
            sum += i;
            System.out.println("New Number: %d | Sum: %d".formatted(i, sum));
        }
    }

    public void iterateArr(int[] arr) {
        for (var i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public Integer findMax(int[] arr) {
        Integer max = arr[0];
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public ArrayList oddArray() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (var i = 0; i < 256; i++) {
            if (i % 2 != 0) result.add(i);
        }
        return result;
    }

    public int greaterThanY(int[] arr, int val) {
        int counter = 0;
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] > val) counter++;
        }
        return counter;
    }

    public int[] noNegatives(int[] arr) {
        String newStr = "[";
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            if (i == arr.length-1) {
                newStr += arr[i];
            } else {
                newStr = newStr + (arr[i]+",");
            }
        }
        System.out.println(newStr + "]");
        return arr;
    }

    public ArrayList minMaxAvg(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = arr[0], min = arr[0], sum = 0, avg = 0;
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i]; 
        }
        avg = sum/arr.length;
        newArr.add(max);
        newArr.add(min);
        newArr.add(avg);
        return newArr;
    }

    public ArrayList shiftToLeft(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (var i = 1; i < arr.length; i++) {
            if (i == arr.length-1) {
                arr[i-1] = arr[i];
                newArr.add(arr[i]);
                arr[i] = 0;
            } else {
                arr[i-1] = arr[i];
            }
            newArr.add(arr[i]);
        }
        return newArr;
    }

}