/**
 * BasicJavaTest
 */
public class BasicJavaTest {

    public static void main(String[] args) {
        BasicJava test = new BasicJava();
        
        int[] someArr = {1,2,3,4,5,6,10};
        
        test.print1To255();
        test.printOdd1To255();
        test.printSums();
        test.iterateArr(someArr);
        System.out.println(test.findMax(someArr));
        System.out.println(test.oddArray());
        System.out.println(test.greaterThanY(someArr, 5));
        test.noNegatives(someArr);
        System.out.println(test.minMaxAvg(someArr));
        System.out.println(test.shiftToLeft(someArr));
    }
}