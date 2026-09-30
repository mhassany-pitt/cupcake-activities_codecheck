#include <iostream>
#include <string>
#include <sstream>
using namespace std;

/**
   Returns the index of the first occurrence of t in s, 
   or -1 if t doesn't occur in s.
*/
int find(string s, string t)
{   
   for (int i = 0; i + t.length() <= s.length(); i++)
   {
      if (s.substr(i, t.length()) == t)
      {
         return i;
      }
   }
   return -1;
}

string firstRepeatedSomewhere(string s)
{



}
