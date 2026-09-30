#include <cctype>
#include <iostream>
#include <sstream>
#include <string>
using namespace std;

int string_to_int(string s)
{
   istringstream strm;
   strm.str(s);
   int n = 0;
   strm >> n;
   return n;
}

int sum_of_integers(string s)
{



}
