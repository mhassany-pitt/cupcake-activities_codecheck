#include <iostream>
using namespace std;

void get_min_and_max(const int arr[], int size, int& min, int& max);

int main()
{
   int a[] = {2,1,3,4,6,5};
   int small, large;
   get_min_and_max(a, 6, small, large);
   cout << small << endl;
   cout << "Expected: 1" << endl;
   cout << large << endl;
   cout << "Expected: 6" << endl;
   
   int b[] = {7,8,9,2,3,4};
   get_min_and_max(b, 6, small, large);
   cout << small << endl;
   cout << "Expected: 2" << endl;
   cout << large << endl;
   cout << "Expected: 9" << endl;   
   
   int c[] = {3,5,2,7,1,4};
   get_min_and_max(c, 6, small, large);
   cout << small << endl;
   cout << "Expected: 1" << endl;
   cout << large << endl;
   cout << "Expected: 7" << endl;   

   int d[] = {-1};
   get_min_and_max(d, 1, small, large);
   cout << small << endl;
   cout << "Expected: -1" << endl;
   cout << large << endl;
   cout << "Expected: -1" << endl;   
}
