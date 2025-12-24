package model;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    private int[] arr;

    public Array(int[] arr) {
        this.arr = arr;
    }
    
    private static final Scanner sc = new Scanner(System.in);

    // Nhập từng phần tử mảng từ bàn phím.
    public Array(int n) {
        arr = new int[n];
        
        Random ran = new Random();
        for (int i = 0; i < n; i++) {
           arr[i] = ran.nextInt(10);
        } 
         System.out.println("Random array: "+ Arrays.toString(arr));           
         
//         Arrays.sort(arr);
         
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//            arr[i] = sc.nextInt();
//        }
    }

    
   // ✅ Hàm sắp xếp tăng dần (Bubble Sort)
        public void sortAscending() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ✅ Hàm tìm kiếm nhị phân (Binary Search)
    public int binarySearch(int key) {
        
//        Arrays.sort(arr); //Sap xep trong Ham luon.
//        System.out.println("Sorted Array: "+ Arrays.toString(arr));
        
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid; // tìm thấy
            } else if (arr[mid] < key) {
                low = mid + 1; // tìm bên phải
            } else {
                high = mid - 1; // tìm bên trái
            }
        }
        return -1; // không tìm thấy
    }

    // ✅ Hiển thị mảng
    public void displayArray() {
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
}//end class.
