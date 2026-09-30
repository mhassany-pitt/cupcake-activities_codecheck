#include <iostream>
#include "array_util.h"
using namespace std;

int most_frequent_elements(const int arr[], int size, int result[]);

int main()
{
   int result[64];
   const int a1[] = {1,2,3,3,3};
   print("a1->", a1, 5);
   int size1 = most_frequent_elements(a1, 5, result);
   cout << "most_frequent_elements(a1, 5, result): " << size1 << endl;
   cout << "Expected: 1" << endl;
   print("result: ", result, size1);
   cout << "Expected: {3}" << endl << endl;

   const int a2[] = {1,2,3,1,2,4};
   print("a2->", a2, 6);
   int size2 = most_frequent_elements(a2, 6, result);
   cout << "most_frequent_elements(a2, 6, result): " << size2 << endl;
   cout << "Expected: 2" << endl;
   print("result: ", result, size2);
   cout << "Expected: {1, 2}" << endl << endl;
   
   const int a3[] = {1,2,3,1,2,3};
   print("a3->", a3, 6);
   int size3 = most_frequent_elements(a3, 6, result);
   cout << "most_frequent_elements(a3, 6, result): " << size3 << endl;
   cout << "Expected: 3" << endl;
   print("result: ", result, size3);
   cout << "Expected: {1, 2, 3}" << endl << endl;
   
   const int a4[] = {1,2,3,1,2,3,2};
   print("a4->", a4, 7);
   int size4 = most_frequent_elements(a4, 7, result);
   cout << "most_frequent_elements(a4, 7, result): " << size4 << endl;
   cout << "Expected: 1" << endl;
   print("result: ", result, size4);
   cout << "Expected: {2}" << endl << endl;
}
