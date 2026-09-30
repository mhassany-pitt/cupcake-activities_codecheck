#include <iostream>
#include "array_util.h"
using namespace std;

int remove_repeated_elements(int arr[], int size);

int main()
{
   int arr1[16] = {1, 2, 1};
   print("arr1", arr1, 3);
   int size1 = remove_repeated_elements(arr1, 3);
   cout << "remove_repeated_elements(arr1, 3): " << size1 << endl;
   cout << "Expected: 2" << endl;
   print("after arr1: ", arr1, size1);
   cout << "Expected: {1, 2}" << endl << endl;
   
   int arr2[16] = {1, 2, 2};
   print("arr2", arr2, 3);
   int size2 = remove_repeated_elements(arr2, 3);
   cout << "remove_repeated_elements(arr2, 3): " << size2 << endl;
   cout << "Expected: 2" << endl;
   print("after arr2: ", arr2, size2);
   cout << "Expected: {1, 2}" << endl << endl;
   
   int arr3[16] = {1,2,3,4,4,5,6,6,2};
   print("arr3", arr3, 9);
   int size3 = remove_repeated_elements(arr3, 9);
   cout << "remove_repeated_elements(arr3, 9): " << size3 << endl;
   cout << "Expected: 6" << endl;
   print("after arr3: ", arr3, 6);
   cout << "Expected: {1, 2, 3, 4, 5, 6}" << endl;
}
