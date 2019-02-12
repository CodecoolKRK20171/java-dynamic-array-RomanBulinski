package com.codecool.dynamicArrayDojo;

// put your code here!
public class DynamicIntArray {

    private int numbersOfElement;
    private int[] arrayStatic;

    public DynamicIntArray() {
        arrayStatic = new int[0];
    }

    public DynamicIntArray(int numbersOfElement) {
        this.numbersOfElement=numbersOfElement;
        arrayStatic = new int[numbersOfElement];
    }

    public void add (int number){

        int sizeOfStaticArray = arrayStatic.length;
        int newSize = sizeOfStaticArray + 1;
        int[]arrayAfterAction = new int[newSize];

        for(int i =0; i<sizeOfStaticArray; i++){
            arrayAfterAction[i]=arrayStatic[i];
        }
        arrayAfterAction[newSize-1] = number;
        arrayStatic = arrayAfterAction;
    }

    public String toString(){
        String arrayInString = "";
        for(int i=0; i<arrayStatic.length; i++){
            arrayInString=arrayInString+" ";
            arrayInString=arrayInString+arrayStatic[i];
        }
        return  arrayInString;
    }

    public void remove (int index){

        int sizeOfStaticArray = arrayStatic.length;
        int newSize = sizeOfStaticArray - 1;
        int[]arrayAfterAction = new int[newSize];

        if ( index > sizeOfStaticArray || index < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i =0; i<index; i++){
            arrayAfterAction[i]=arrayStatic[i];
        }
        for(int i =index; i<newSize; i++){
            arrayAfterAction[i]=arrayStatic[i+1];
        }
        arrayStatic = arrayAfterAction;
    }


    public void insert (int index, int value){

        int sizeOfStaticArray = arrayStatic.length;
        int newSize = sizeOfStaticArray+1 ;
        int[]arrayAfterAction = new int[newSize];

        if(index>newSize){
            for(int i = 0; i<sizeOfStaticArray; i++){
                arrayAfterAction[i]=arrayStatic[i];
            }
            arrayAfterAction[newSize-1]=value;
        }
       if(index<newSize) {
           for(int i = 0; i<index; i++){
               arrayAfterAction[i]=arrayStatic[i];
           }
           arrayAfterAction[index]=value;
           for(int i =index+1; i<newSize; i++){
               arrayAfterAction[i]=arrayStatic[i-1];
           }
       }
        arrayStatic = arrayAfterAction;
    }

}
