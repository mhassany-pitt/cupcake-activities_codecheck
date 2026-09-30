#include <iostream>
using namespace std;

void fillWithRange(int arr[], int arr_size, int a, int b);

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
   int arr1[] = { 0, 0, 0, 0, 0, 0 };
   fillWithRange(arr1, 6, 3, 8);
   print(arr1, 6);
   cout << "Expected: { 3, 4, 5, 6, 7, 8 }" << endl;
   int arr2[] = { 0, 0, 0, 0, 0, 0, 0 };
   fillWithRange(arr2, 6, 3, 8);
   print(arr2, 7);
   cout << "Expected: { 3, 4, 5, 6, 7, 8, 0 }" << endl;
   int arr3[] = { 0, 0, 0, 0, 0, 0, 0 };
   fillWithRange(arr3, 6, 3, 10);
   print(arr3, 7);
   cout << "Expected: { 3, 4, 5, 6, 7, 8, 0 }" << endl;
   int arr4[] = { 0, 0, 0, 0, 0, 0, 0 };
   fillWithRange(arr4, 6, 10, 8);
   print(arr4, 7);
   cout << "Expected: { 0, 0, 0, 0, 0, 0, 0 }" << endl;
   int arr5[] = { 0, 0, 0, 0, 0, 0, 0 };
   fillWithRange(arr5, 7, 4, 8);
   print(arr5, 7);
   cout << "Expected: { 4, 5, 6, 7, 8, 0, 0 }" << endl;
   return 0;
}
