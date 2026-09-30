#include <iostream>
#include "array_util.h"
using namespace std;

int unique_elements(const int arr[], int size, int result[]);

int main()
{
   int result[64];
   const int a1[] = {1, 2, 1, 3, 3};
   print("a1->", a1, 5);
   int size1 = unique_elements(a1, 5, result);
   cout << "unique_elements(a1, 5, result): " << size1 << endl;
   cout << "Expected: 1" << endl;
   print("result: ", result, size1);
   cout << "Expected: {2}" << endl << endl;

   const int a2[] = {1, 2, 2, 2, 3, 2};
   print("a2->", a2, 6);
   int size2 = unique_elements(a2, 6, result);
   cout << "unique_elements(a2, 6, result): " << size2 << endl;
   cout << "Expected: 2" << endl;
   print("result: ", result, size2);
   cout << "Expected: {1, 3}" << endl << endl;
   
   const int a3[] = {1, 2, 3};
   print("a3->", a3, 3);
   int size3 = unique_elements(a3, 3, result);
   cout << "unique_elements(a3, 3, result): " << size3 << endl;
   cout << "Expected: 3" << endl;
   print("result: ", result, size3);
   cout << "Expected: {1, 2, 3}" << endl << endl;
   
   const int a4[] = {1,2,3,1,2,3,2};
   print("a4->", a4, 7);
   int size4 = unique_elements(a4, 7, result);
   cout << "unique_elements(a4, 7, result): " << size4 << endl;
   cout << "Expected: 0" << endl;
   print("result: ", result, size4);
   cout << "Expected: {}" << endl << endl;
}
