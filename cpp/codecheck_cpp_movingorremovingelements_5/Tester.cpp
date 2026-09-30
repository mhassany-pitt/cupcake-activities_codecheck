#include <iostream>
#include "array_util.h"
using namespace std;

int remove_double_even_elements(int arr[], int size);

int main()
{
   
   int arr1[] = {1, 2, 2, 3, 5, 6, 6, 3, 4, 5};
   print("before arr1: ", arr1, 10);
   int size1 = remove_double_even_elements(arr1, 10);
   cout << "New size: " << size1 << endl;
   cout << "Expected: 2" << endl;
   print("after arr1: ", arr1, size1);
   cout << "Expected: {1, 4}" << endl;

   int arr2[] = {2, 4, 5, 6, 7, 6 };
   print("\nbefore arr2: ", arr2, 6);
   int size2 = remove_double_even_elements(arr2, 6);   
   cout << "New size: " << size2 << endl;
   cout << "Expected: 4" << endl;
   print("after aar2: ", arr2, size2);
   cout << "Expected: {2, 4, 5, 7}" << endl;
   
   int arr3[] = {2, 4, 5, 6, 7, 6, 6, 7};
   print("\nbefore arr3: ", arr3, 8);
   int size3 = remove_double_even_elements(arr3, 8);
   cout << "New size: " << size3 << endl;
   cout << "Expected: 6" << endl;
   print("after arr3: ", arr3, size3);
   cout << "Expected: {2, 4, 5, 6, 6, 6}" << endl;
   
   int arr4[] = {2,2};
   print("\nbefore arr4: ", arr4, 2);
   int size4 = remove_double_even_elements(arr4, 2);
   cout << "New size: " << size4 << endl;
   cout << "Expected: 0" << endl;
   print("after arr4: ", arr4, size4);
   cout << "Expected: {}" << endl;
}
