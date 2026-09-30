#include <iostream>
using namespace std;

void first_and_last_sorted(const int arr[], int size, int& smaller, int& larger);

int main()
{
   int a[] = {1,2,3,4,5,6};
   int small, large;
   first_and_last_sorted(a, 6, small, large);
   cout << small << endl;
   cout << "Expected: 1" << endl;
   cout << large << endl;
   cout << "Expected: 6" << endl;
   
   int b[] = {6,5,4,3,2,1};
   first_and_last_sorted(b, 6, small, large);
   cout << small << endl;
   cout << "Expected: 1" << endl;
   cout << large << endl;
   cout << "Expected: 6" << endl;   
   
   int c[] = {3,5,2,7,1,4};
   first_and_last_sorted(c, 6, small, large);
   cout << small << endl;
   cout << "Expected: 3" << endl;
   cout << large << endl;
   cout << "Expected: 4" << endl;   

   int d[] = {5,3,2,7,1,4};
   first_and_last_sorted(d, 6, small, large);
   cout << small << endl;
   cout << "Expected: 4" << endl;
   cout << large << endl;
   cout << "Expected: 5" << endl;   
}
