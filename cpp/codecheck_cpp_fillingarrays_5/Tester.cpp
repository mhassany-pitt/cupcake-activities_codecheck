#include <iostream>
using namespace std;

int repeatNumTimes(int arr[], int arr_size, int n);

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
   int arr1[] = { 0, 0, 0, 0, 0, 0, 0 };
   int n = repeatNumTimes(arr1, 6, 3);
   print(arr1, 7);
   cout << "Expected: { 1, 2, 2, 3, 3, 3, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 6" << endl;
   int arr2[] = { 0, 0, 0, 0, 0, 0, 0, 0 };
   n = repeatNumTimes(arr2, 7, 4);
   print(arr2, 8);
   cout << "Expected: { 1, 2, 2, 3, 3, 3, 4, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 7" << endl;
   int arr3[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
   n = repeatNumTimes(arr3, 11, 4);
   print(arr3, 11);
   cout << "Expected: { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 0 }" << endl;
   cout << n << endl;
   cout << "Expected: 10" << endl;
   
   return 0;
}
