#include <iostream>
using namespace std;

void swapFirstLast(int arr[], int arr_size);

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
   swapFirstLast(arr1, 6);
   print(arr1, 6);
   cout << "Expected: { 6, 2, 3, 4, 5, 1 }" << endl;
   int arr2[] = { 1, 2 };
   swapFirstLast(arr2, 2);
   print(arr2, 2);
   cout << "Expected: { 2, 1 }" << endl;
   int arr3[] = { 1 };
   swapFirstLast(arr3, 1);
   print(arr3, 1);
   cout << "Expected: { 1 }" << endl;
   return 0;
}
