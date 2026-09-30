#include <iostream>
using namespace std;

void moveZerosToBack(int arr[], int arr_size);

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
   int arr1[] = { -3,0,-1,0,1,2,3 };
   moveZerosToBack(arr1, 7);   
   print(arr1, 7);
   cout << "Expected: { -3, -1, 1, 2, 3, 0, 0 }" << endl;
   int arr2[] = { 0, 0, 0, 1, 2, 3 };
   moveZerosToBack(arr2, 6);   
   print(arr2, 6);
   cout << "Expected: { 1, 2, 3, 0, 0, 0 }" << endl;
   int arr3[] = { 4, 5, 1, 2, 3 };
   moveZerosToBack(arr3, 5);   
   print(arr3, 5);
   cout << "Expected: { 4, 5, 1, 2, 3 }" << endl;
   int arr4[] = { 0, 0, 0, 0 };
   moveZerosToBack(arr4, 4);   
   print(arr4, 4);
   cout << "Expected: { 0, 0, 0, 0 }" << endl;
   return 0;
}
