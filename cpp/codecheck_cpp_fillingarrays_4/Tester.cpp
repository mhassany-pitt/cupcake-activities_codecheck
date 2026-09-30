#include <iostream>
using namespace std;

int fillWithEven(int arr[], int arr_size, int a, int b);

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
   int n = fillWithEven(arr1, 6, 6, 16);
   print(arr1, 6);
   cout << "Expected: { 6, 8, 10, 12, 14, 16 }" << endl;
   cout << n << endl;
   cout << "Expected: 6" << endl;
   int arr2[] = { 0, 0, 0, 0, 0, 0 };
   n = fillWithEven(arr2, 6, 5, 17);
   print(arr2, 6);
   cout << "Expected: { 6, 8, 10, 12, 14, 16 }" << endl;
   cout << n << endl;
   cout << "Expected: 6" << endl;
   int arr3[] = { 0, 0, 0, 0, 0, 0, 0 };
   n = fillWithEven(arr3, 6, 6, 17);
   print(arr3, 7);
   cout << "Expected: { 6, 8, 10, 12, 14, 16, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 6" << endl;
   int arr4[] = { 0, 0, 0, 0, 0, 0 };
   n = fillWithEven(arr4, 5, 7, 100);
   print(arr4, 6);
   cout << "Expected: { 8, 10, 12, 14, 16, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 5" << endl;
   int arr5[] = { 0, 0, 0, 0, 0, 0 };
   n = fillWithEven(arr5, 6, 7, 6);
   print(arr5, 6);
   cout << "Expected: { 0, 0, 0, 0, 0, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 0" << endl;
   
   return 0;
}
