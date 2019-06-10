package com.dailycodingproblems.jo;

public class Main {

    public static void main(String[] args) {
	int[] testArray = {3,2,1};
	int[] ints = newMultiArray(testArray);
	for(int i=0;i<ints.length;i++)
	    System.out.println(ints[i]);
    }


    // [1,2,3,4,5] => [120,60,40,30,24]
    public static int[] newMultiArray(int[] formerArray) {
        int[] newArray = new int[formerArray.length];
        int total = 1;
        for(int i=0;i<formerArray.length;i++)
            total = total * formerArray[i];
        for(int j=0;j<formerArray.length;j++)
            newArray[j] = total / formerArray[j];
        return newArray;
    }
}
