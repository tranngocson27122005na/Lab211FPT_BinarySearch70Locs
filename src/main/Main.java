package main;

import model.Array;
import validation.Validation;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Enter number of array:");
        int n = Validation.checkInput();

        Array bs = new Array(n); // nhập từng phần tử
       
        bs.sortAscending();      // thêm bước sắp xếp trước khi tìm kiếm

        bs.displayArray(); // Sap xep trong ham luon thi boj.

        
        System.out.println("Enter search value:");
        
        int key = Validation.checkValue();
        
//        int index = bs.binarySearch(key); //Nếu làm random và Bubble Sort.

        int index = bs.binarySearch(key);
        if (index == -1) {
            System.out.println("Value not found!");
        } else {
            System.out.println("Find at index: " + index);
        }
    }
}



/*  Theo sort có sẵn trong hàm String.
package main;

import model.Array;
import validation.Validation;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Enter number of array:");
        int n = Validation.checkInput();

        Array bs = new Array(n); // nhập từng phần tử
       
//        bs.sortAscending();      // thêm bước sắp xếp trước khi tìm kiếm
        System.out.println("Array Sort:");
        bs.displayArray(); // Sap xep trong ham luon thi boj.

        
        System.out.println("Enter search value:");
        
        int key = Validation.checkValue();
//        int index = bs.binarySearch(key); //Nếu làm random và Bubble Sort.
       

        int index = bs.binarySearch(key);
        if (index == -1) {
            System.out.println("Value not found!");
        } else {
            System.out.println("Find at index: " + index);
        }
    }
}

*/