#include <iostream>
using namespace std;

int removeElementsOutsideRange(int arr[], int arr_size, int n);

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
   int arr1[] = { -3,-2,-1,0,1,2,3 };
   int result = removeElementsOutsideRange(arr1, 7, 1);   
   print(arr1, 3);
   cout << "Expected: { -1, 0, 1 }" << endl;
   cout << result << endl;
   cout << "Expected: 3" << endl;
   int arr2[] = { -3,-2,-1,0,1,2,3 };
   result = removeElementsOutsideRange(arr2, 7, 2);   
   print(arr2, 5);
   cout << "Expected: { -2, -1, 0, 1, 2 }" << endl;
   cout << result << endl;
   cout << "Expected: 5" << endl;
   int arr3[] = { -3,-2,-1,0,1,2,3 };
   result = removeElementsOutsideRange(arr3, 7, 3);   
   print(arr3, 7);
   cout << "Expected: { -3, -2, -1, 0, 1, 2, 3 }" << endl;
   cout << result << endl;
   cout << "Expected: 7" << endl;
   int arr4[] = { 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6 };
   result = removeElementsOutsideRange(arr4, 11, 3);   
   print(arr4, 5);
   cout << "Expected: { 3, 2, 1, 2, 3 }" << endl;
   cout << result << endl;
   cout << "Expected: 5" << endl;
   return 0;
}
