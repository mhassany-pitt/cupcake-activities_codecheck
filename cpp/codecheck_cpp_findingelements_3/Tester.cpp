#include <iostream>
#include "array_util.h"
using namespace std;

int find_all_positions(const int a[], int size, int val, int result[]);

int main()
{
   int result[64];
   const int a1[] = {1,4,6,3,7,4};
   print("a1->", a1, 6);
   int size1 = find_all_positions(a1, 6, 4, result);
   cout << "find_all_positions(a1, 6, 4, result): " << size1 << endl;
   cout << "Expected: 2" << endl;
   print("result: ", result, size1);
   cout << "Expected: {1, 5}" << endl << endl;

   const int a2[] = {1,4,6,3,7,4};
   print("a2->", a2, 6);
   int size2 = find_all_positions(a2, 6, 6, result);
   cout << "find_all_positions(a2, 6, 6, result): " << size2 << endl;
   cout << "Expected: 1" << endl;
   print("result: ", result, size2);
   cout << "Expected: {2}" << endl << endl;
   
   const int a3[] = {1,4,1,1,7,1};
   print("a3->", a3, 6);
   int size3 = find_all_positions(a3, 6, 1, result);
   cout << "find_all_positions(a3, 3, 1, result): " << size3 << endl;
   cout << "Expected: 4" << endl;
   print("result: ", result, size3);
   cout << "Expected: {0, 2, 3, 5}" << endl << endl;
   
   const int a4[] = {1,4,6,3,7,4};
   print("a4->", a4, 6);
   int size4 = find_all_positions(a4, 6, 2, result);
   cout << "find_all_positions(a4, 6, 2, result): " << size4 << endl;
   cout << "Expected: 0" << endl;
   print("result: ", result, size4);
   cout << "Expected: {}" << endl << endl;
}
