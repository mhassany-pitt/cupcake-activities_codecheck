#include <iostream>
using namespace std;

void pairAverage(double arr[], int arr_size, double result[]);

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
   double arr1[] = { 1.2, 3.4, 5.6, 7.9 };
   double averages1[] = { 0, 0, 0, 0, 0 };
   pairAverage(arr1, 4, averages1);   
   print(averages1, 4);
   cout << "Expected: { 2.3, 4.5, 6.75, 0 }" << endl;
   double arr2[] = { -1, 0, 1, 2, 3, 4, 5, 6, 7 };
   double averages2[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
   pairAverage(arr2, 9, averages2);   
   print(averages2, 9);
   cout << "Expected: { -0.5, 0.5, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 0 }" << endl;
   double arr3[] = { 5, 10 };
   double averages3[] = { 0, 0 };
   pairAverage(arr3, 2, averages3);   
   print(averages3, 2);
   cout << "Expected: { 7.5, 0 }" << endl;
   double arr4[] = { 5 };
   double averages4[] = { 0 };
   pairAverage(arr4, 1, averages4);   
   print(averages4, 1);
   cout << "Expected: { 0 }" << endl;

   return 0;
}
