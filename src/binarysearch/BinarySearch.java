/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author somia saber
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arr={3,8,1,9,5};   
          linearsearch(arr,6);
          
          Binarysearch(arr,7,0,7);
          selectionsort(arr);
          for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);

          }
          
          
    
    
    }
    public static void linearsearch (int arr[],int key){
    for(int i=0;i<arr.length;i++){
    if(arr[i]==key){
    System.out.println("element to index"+ i);
    return;}}
        System.out.println("element not found");
        
    }
        public static void Binarysearch (int arr[],int key,int f,int l){
        int mid =(f+l)/2;
        while(f<=l){
        if(arr[mid]<key)
            f=mid+1;
        else if(arr[mid]>key)
            l=mid-1;
        else if(arr[mid]==key){
                System.out.println("element to index"+ mid);
        break;
        }
          mid =(f+l)/2;
         
        }
        if(f>l){
        System.out.println("element not found");

        }
    
        }
        
        public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
        int min =i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min])
                min=j;
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        
        }
        }
        
        }
    }
    
    
    

