#include <iostream>
#include "array_util.h"
using namespace std;

void move_zeros_to_front(int arr[], int arr_size);

int main()
{
   int arr1[] = {-3, 0, -1, 0, 1, 2, 3};
   print("before arr1: ", arr1, 7);
   move_zeros_to_front(arr1, 7);   
   print("after arr1: ", arr1, 7);
   cout << "Expected: {0, 0, -3, -1, 1, 2, 3}" << endl;
   
   int arr2[] = {1, 2, 3, 0, 0, 0};
   print("\nbefore arr2: ", arr2, 6);
   move_zeros_to_front(arr2, 6);   
   print("after aar2: ", arr2, 6);
   cout << "Expected: {0, 0, 0, 1, 2, 3}" << endl;
   
   int arr3[] = {4, 5, 1, 2, 3};
   print("\nbefore arr3: ", arr3, 5);
   move_zeros_to_front(arr3, 5);   
   print("after arr3: ", arr3, 5);
   cout << "Expected: {4, 5, 1, 2, 3}" << endl;
   
   int arr4[] = {0, 0, 0, 0};
   print("\nbefore arr4: ", arr4, 4);
   move_zeros_to_front(arr4, 4);   
   print("after arr4: ", arr4, 4);
   cout << "Expected: {0, 0, 0, 0}" << endl;
}
