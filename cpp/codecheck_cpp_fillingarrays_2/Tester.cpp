#include <iostream>
using namespace std;

void repeatSequence(int arr[], int arr_size, int k);
   
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
   repeatSequence(arr1, 6, 3);
   print(arr1, 6);
   cout << "Expected: { 0, 1, 2, 0, 1, 2 }" << endl;
   int arr2[] = { 0, 0, 0, 0, 0, 0, 0, 0};
   repeatSequence(arr2, 8, 3);
   print(arr2, 8);
   cout << "Expected: { 0, 1, 2, 0, 1, 2, 0, 1 }" << endl;
   int arr3[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
   repeatSequence(arr3, 8, 3);
   print(arr3, 9);
   cout << "Expected: { 0, 1, 2, 0, 1, 2, 0, 1, 0 }" << endl;
   int arr4[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
   repeatSequence(arr4, 9, 11);
   print(arr4, 9);
   cout << "Expected: { 0, 1, 2, 3, 4, 5, 6, 7, 8 }" << endl;
   int arr5[] = { 0, 0, 0, 0 };
   repeatSequence(arr5, 4, 1);
   print(arr5, 4);
   cout << "Expected: { 0, 0, 0, 0 }" << endl;
   
   return 0;
}
