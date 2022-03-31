class MergeSort 
{ 
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r) 
    {  
       //Your code here  
	    
	// Find sizes of two subarrays
        int num1 = m - l + 1;
        int num2 = r - m;
	    
	// Create temp arrays
        int Left[] = new int[num1];
        int Right[] = new int[num2];
	    
	// Copy data to temp arrays
        for (int i = 0; i < num1; ++i)
            Left[i] = arr[l + i];
        for (int j = 0; j < num2; ++j)
            Right[j] = arr[m + 1 + j];
	    
	// Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
	    
        while (i < num1 && j < num2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
  
        // Copy remaining elements of Left
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }
  
        // Copy remaining elements of Right
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
	//Write your code here
        //Call mergeSort from here 
	    
	 if (l < r) {
            int medium =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, medium);
            sort(arr, medium + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, medium, r);
        }
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 
