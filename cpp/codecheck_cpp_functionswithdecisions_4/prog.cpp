#include <iostream>
#include <string>
using namespace std;

bool areSameColor(string space1, string space2)
{
   string col1 = space1.substr(0, 1);
   string row1 = space1.substr(1, 1);
    
   string col2 = space2.substr(0, 1);
   string row2 = space2.substr(1, 1);

   bool row1Even = row1 == "0" || row1 == "2" || row1 == "4" || row1 == "6";



}
