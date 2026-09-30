#include <iostream>
using namespace std;

void swapFirstLastTwo(int arr[], int arr_size);

void print(const int values[], int values_size)
{
   for (int i = 0; i < values_size; i++)
   {
      if (i == 0) { cout << "{ "; }
      else { cout << ", "; }      
      cout << values[i];
   }
   cout << " }" << endl;     
}

int main()
{
   int arr1[] = { 1, 2, 3, 4, 5, 6 };
   swapFirstLastTwo(arr1, 6);
   print(arr1, 6);
   cout << "Expected: { 6, 5, 3, 4, 2, 1 }" << endl;
   int arr2[] = { 1, 2, 3, 4 };
   swapFirstLastTwo(arr2, 4);
   print(arr2, 4);
   cout << "Expected: { 4, 3, 2, 1 }" << endl;
   int arr3[] = { 1, 2, 3, 4, 5 };
   swapFirstLastTwo(arr3, 5);
   print(arr3, 5);
   cout << "Expected: { 5, 4, 3, 2, 1 }" << endl;
   return 0;
}
