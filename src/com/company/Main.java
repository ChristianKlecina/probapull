package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String sentence = "Hey snow is white.";
//        String[] sent = sentence.split(" ");
//
//        for (int i = 0; i<sent.length; i++) {
//            System.out.println(sent[i]);
//        }
//
//        String word = sent[sent.length-1].replace(".", "");
//        System.out.println(word);

        int[] array = {1,6,4,3,7,8,2,5};

        for(int i = 0; i< array.length-1; i++){
            for(int j = 0; j<array.length-i-1; j++){
                int temp;
                if(array[j] < array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for(int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}
