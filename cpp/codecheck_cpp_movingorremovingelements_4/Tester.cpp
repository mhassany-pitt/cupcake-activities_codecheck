#include <iostream>
#include "array_util.h"
using namespace std;

void move_positive_and_negative(int arr[], int arr_size);

int main()
{
   int arr1[] = {-1, 1, -2, 2, -3, 3};
   print("before arr1: ", arr1, 6);
   move_positive_and_negative(arr1, 6);   
   print("after arr1: ", arr1, 6);
   cout << "Expected: {-1, -2, -3, 1, 2, 3}" << endl;
   
   int arr2[] = {-4, 9, -7, 2, -3, 6};
   print("\nbefore arr2: ", arr2, 6);
   move_positive_and_negative(arr2, 6);   
   print("after aar2: ", arr2, 6);
   cout << "Expected: {-4, -7, -3, 9, 2, 6}" << endl;
   
   int arr3[] = {4, 5, 1, 2, 3};
   print("\nbefore arr3: ", arr3, 5);
   move_positive_and_negative(arr3, 5);   
   print("after arr3: ", arr3, 5);
   cout << "Expected: {4, 5, 1, 2, 3}" << endl;
   
   int arr4[] = {1, -1};
   print("\nbefore arr4: ", arr4, 2);
   move_positive_and_negative(arr4, 2);   
   print("after arr4: ", arr4, 2);
   cout << "Expected: {-1, 1}" << endl;
}
