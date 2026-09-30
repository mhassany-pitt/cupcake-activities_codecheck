#include <iostream>
using namespace std;

void consecutiveAverages(double arr[], int arr_size, int n, double result[]);

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
   double arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
   double averages1[] = { 0, 0, 0, 0, 0, 0 };
   consecutiveAverages(arr1, 7, 3, averages1);   
   print(averages1, 6);
   cout << "Expected: { 2, 3, 4, 5, 6, 0 }" << endl;
   double arr2[] = { 2, 2, 4, 4, 6, 6 };
   double averages2[] = { 0, 0, 0, 0 };
   consecutiveAverages(arr2, 6, 4, averages2);   
   print(averages2, 4);
   cout << "Expected: { 3, 4, 5, 0 }" << endl;
   double arr3[] = { 1, 2, 3, 4, 5 };
   double averages3[] = { 0, 0, 0, 0, 0 };
   consecutiveAverages(arr3, 5, 2, averages3);   
   print(averages3, 5);
   cout << "Expected: { 1.5, 2.5, 3.5, 4.5, 0 }" << endl;
   double arr4[] = { 1, 2, 3, 4, 5, };
   double averages4[] = { 0, 0, 0, 0, 0, 0 };
   consecutiveAverages(arr4, 5, 1, averages4);   
   print(averages4, 6);
   cout << "Expected: { 1, 2, 3, 4, 5, 0 }" << endl;

   return 0;
}
