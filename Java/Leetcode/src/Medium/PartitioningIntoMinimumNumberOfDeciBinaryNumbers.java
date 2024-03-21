package Medium;

import java.util.Arrays;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public static void main(String[] args){
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers partitioningIntoMinimumNumberOfDeciBinaryNumbers = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        String n = "32";
        System.out.println(partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n));
        n = "82734";
        System.out.println(partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n));
        n = "27346209830709182346";
        System.out.println(partitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n));

    }

    public int minPartitions(String n) {

        char[] numbers = n.toCharArray();

        char maxNum = '0';
        for (char number : numbers) {
            if(number > maxNum){
                maxNum = number;
            }
        }

        return (int) (maxNum - '0');
    }
}
