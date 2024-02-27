import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSums twosums = new TwoSums(new int[]{2,7,11,15}, 9);
        System.out.println(Arrays.toString(twosums.solution()));
        System.out.println(printArray(twosums.solution()));

    }

    public static String printArray(int[] array){

        if(array==null)
            return "No suitable for this case";

        StringBuilder s = new StringBuilder();
        s.append('[');
        for(int i=0; i<array.length; i++){
            s.append(array[i]);
            if(i<array.length-1) {
                s.append(',');
                s.append(' ');
            }
        }
        s.append(']');
        return s.toString();
    }
}