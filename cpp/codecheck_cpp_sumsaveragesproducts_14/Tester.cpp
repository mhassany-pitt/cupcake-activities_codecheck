#include <iostream>
using namespace std;

void averageOfNeighbors(double arr[], int arr_size);

void print(const double values[], int values_size)
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
   double arr1[] = { 1, 2, 3, 4, 5, 6, 7, 0 };
   averageOfNeighbors(arr1, 7);   
   print(arr1, 8);
   cout << "Expected: { 2, 2, 3, 4, 5, 6, 6, 0 }" << endl;
   double arr2[] = { 1, 1, 2, 3, 5, 8, 0 };
   averageOfNeighbors(arr2, 6);   
   print(arr2, 7);
   cout << "Expected: { 1, 1.5, 2, 3.5, 5.5, 5, 0 }" << endl;
   double arr3[] = { 3, 1, 4, 0 };
   averageOfNeighbors(arr3, 3);   
   print(arr3, 4);
   cout << "Expected: { 1, 3.5, 1, 0 }" << endl;
   double arr4[] = { 3, 1, 0 };
   averageOfNeighbors(arr4, 2);   
   print(arr4, 3);
   cout << "Expected: { 1, 3, 0 }" << endl;
   double arr5[] = { 3, 0 };
   averageOfNeighbors(arr5, 1);   
   print(arr5, 2);
   cout << "Expected: { 3, 0 }" << endl;
   
   return 0;
}
