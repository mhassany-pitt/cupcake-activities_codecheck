#include <iostream>
#include <vector>
#include "vector_util.h"
using namespace std;

vector<vector<int> > split_even_odd_indices(const vector<int>& numbers);

int main()
{
   vector<int> v1{2,1,-3,4,-6,5};
   cout << "v1->" << v1 << endl;
   vector<vector<int> > result = split_even_odd_indices(v1);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [2, -3, -6]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: [1, 4, 5]" << endl;
   
   vector<int> v2{8,7,9,3,5};
   cout << "\nv2->" << v2 << endl;
   result = split_even_odd_indices(v2);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [8, 9, 5]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: [7, 3]" << endl;
   
   vector<int> v3{42};
   cout << "\nv3->" << v3 << endl;
   result = split_even_odd_indices(v3);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [42]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: []" << endl;

   vector<int> v4;
   cout << "\nv4->" << v4 << endl;
   result = split_even_odd_indices(v4);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: []" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: []" << endl;
}
