#include <iostream>
using namespace std;

void count_positive_and_negative(const int arr[], int size, int& neg, int& pos);

int main()
{
   int a[] = {2,1,-3,4,-6,5};
   int negative, positive;
   count_positive_and_negative(a, 6, negative, positive);
   cout << negative << endl;
   cout << "Expected: 2" << endl;
   cout << positive << endl;
   cout << "Expected: 4" << endl;
   
   int b[] = {7,0,-9,0,-3,4};
   count_positive_and_negative(b, 6, negative, positive);
   cout << negative << endl;
   cout << "Expected: 2" << endl;
   cout << positive << endl;
   cout << "Expected: 2" << endl;   
   
   int c[] = {42};
   count_positive_and_negative(c, 1, negative, positive);
   cout << negative << endl;
   cout << "Expected: 0" << endl;
   cout << positive << endl;
   cout << "Expected: 1" << endl;   

   int d[] = {-1};
   count_positive_and_negative(d, 1, negative, positive);
   cout << negative << endl;
   cout << "Expected: 1" << endl;
   cout << positive << endl;
   cout << "Expected: 0" << endl;   

   int e[] = {};
   count_positive_and_negative(e, 0, negative, positive);
   cout << negative << endl;
   cout << "Expected: 0" << endl;
   cout << positive << endl;
   cout << "Expected: 0" << endl;   
}
