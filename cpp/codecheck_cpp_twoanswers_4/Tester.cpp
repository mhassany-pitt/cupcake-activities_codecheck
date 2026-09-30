#include <iostream>
#include <vector>
#include "vector_util.h"
using namespace std;

vector<vector<int> > return_positive_negative(const vector<int>& numbers);

int main()
{
   vector<int> v1{2,1,-3,4,-6,5};
   cout << "v1->" << v1 << endl;
   vector<vector<int> > result = return_positive_negative(v1);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [2, 1, 4, 5]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: [-3, -6]" << endl;
   
   vector<int> v2{7,0,-9,0,-3,4};
   cout << "\nv2->" << v2 << endl;
   result = return_positive_negative(v2);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [7, 4]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: [-9, -3]" << endl;
   
   vector<int> v3{42};
   cout << "\nv3->" << v3 << endl;
   result = return_positive_negative(v3);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: [42]" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: []" << endl;

   vector<int> v4{-1};
   cout << "\nv4->" << v4 << endl;
   result = return_positive_negative(v4);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: []" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: [-1]" << endl;

   vector<int> v5;
   cout << "\nv5->" << v5 << endl;
   result = return_positive_negative(v5);
   cout << "result[0]: " << result[0] << endl;
   cout << "Expected: []" << endl;
   cout << "result[1]: " << result[1] << endl;
   cout << "Expected: []" << endl;
}
