#include <iostream>
using namespace std;

double averageLengthOfStringsContaining(const string arr[], int arr_size, string s);

int main()
{   
   const string arr1[] = { "hello","hi", "here", "there", "their"};
   double result = averageLengthOfStringsContaining(arr1, 5, "he");
   cout << result << endl;
   cout << "Expected: 4.75" << endl;

   const string arr2[] = { "hello","hi", "there", "bye"};
   result = averageLengthOfStringsContaining(arr2, 4, "hi");
   cout << result << endl;
   cout << "Expected: 2" << endl;

   result = averageLengthOfStringsContaining(arr2, 4, "ho");
   cout << result << endl;
   cout << "Expected: 0" << endl;
   
   return 0;
}
