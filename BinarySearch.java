
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        
        // Start by checking the initial array sizes to determine the lowest index,
        // highest index and middle value.
        // Define them as variables, as the values will change during the array check loop.
        
        boolean hasbeenfound = false;
        
        int arrayLength = array.length;
        int minIndex = 0;
        int maxIndex = arrayLength - 1;
        
        // middleIndex must be integer value to be used with array index.
        int middleIndex = (minIndex + maxIndex) / 2;
        

        // Loop defined to keep searching the array with conditions:
        // - the value is still not found
        // - the min and max index of the searchable area do not colide (meaning no more searchable area)
        // - the outer limits of the arrays have not been reached yet (middleIndex falls on 0 or max array length position)
        
        while (hasbeenfound == false && minIndex != maxIndex && middleIndex > 0 && middleIndex < arrayLength - 1) {
 
            // Calculate the middleIndex for the area to be searched
            middleIndex = (minIndex + maxIndex) / 2;
            System.out.println("Min Index: " + minIndex + " /// Max Index: " + maxIndex);
            System.out.println("Calculated middle index: " + middleIndex);
            
            // If the searched value does not fall on the middle index, 
            // divide the array in 2 new pieces, excluding the just searched middle index.

            if (searchedValue < array[middleIndex]) {

                System.out.println("The searched value is on an index LOWER THAN: " + middleIndex);
                // The max index shifts now to one position lower than the checked middle index.
                maxIndex = middleIndex -1;
            }

            else if (searchedValue > array[middleIndex]) {

                System.out.println("The searched value is on an index HIGHER THAN: " + middleIndex);
                // The min index now shifts to one position higher than the checked middle index.
                minIndex = middleIndex + 1;
            }
            
            else {
                // Value has been found on the middle index!
                hasbeenfound = true;
            }
            System.out.println();
            
        }    
        
        // When out of the while loop, still check whether the searched value was on the lowest or highest limit.
        if (minIndex == maxIndex && array[minIndex] == searchedValue) {
            hasbeenfound = true;
        }
                
        return hasbeenfound;
        
    }
    
}
