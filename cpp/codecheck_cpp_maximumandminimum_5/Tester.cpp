#include <iostream>
using namespace std;

void swapMinAndMax(int arr[], int arr_size);

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
   int arr1[] = { 1, 4, 5, 9, 2, 6 };
   swapMinAndMax(arr1, 6);
   print(arr1, 6);
   cout << "Expected: { 9, 4, 5, 1, 2, 6 }" << endl;
   int arr2[] = { 1, 4, 1, 5, 9, 2, 6 };
   swapMinAndMax(arr2, 7);
   print(arr2, 7);
   cout << "Expected: { 9, 4, 9, 5, 1, 2, 6 }" << endl;
   int arr3[] = { 1, 1, 1 };
   swapMinAndMax(arr3, 3);
   print(arr3, 3);
   cout << "Expected: { 1, 1, 1 }" << endl;
   
   return 0;
}
