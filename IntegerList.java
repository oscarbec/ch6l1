// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************

import java.util.Scanner;

public class IntegerList{

    int[] list;
    int targetValue;
    //values in the list
    Scanner scan = new Scanner(System.in);

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
    list = new int[size];
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
    for (int i=0; i<list.length; i++)
        list[i] = (int)(Math.random() * 100) + 1;
    }
    public void replaceFirst(int oldVal, int newVal){
        int valToFind = oldVal;
        int replacementVal = newVal;
        for (int i =0; i < list.length -1; i++){
            if (list[i] == valToFind){
                list[i] = replacementVal;
                break;
            }
            
        
        }
    
    }
    public void replaceAll(int oldVal, int newVal){
        int valToFind = oldVal;
        int replacementVal = newVal;
        for (int i =0; i < list.length -1; i++){
            if (list[i] == valToFind){
                list[i] = replacementVal;
                
            }
            
        
        }
        
    
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
    for (int i=0; i<list.length; i++)
        System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
    this.targetValue = target;
    for (int s = 0; s < list.length; s++){
        if (list[s] == targetValue)
        {return s;}
       }
    return -1;
        
    }

    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
    int minIndex = list[0];
    
    int placeHolder;
    for (int i=0; i < list.length-1; i++)
        {
        //find smallest element in list starting at location i
        if (list[i] < list[minIndex]){
            minIndex = i;
        }
        

        //swap list[i] with smallest element
        placeHolder = list[minIndex];
        list[minIndex] = list[i];
        list[i] = placeHolder;
        
        
        }
    }
}
