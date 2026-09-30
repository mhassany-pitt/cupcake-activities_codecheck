#include <cctype>
#include <iostream>
#include <string>
using namespace std;

/**
   Makes an lowercase version of a string.
   @param str a string
   @return a string with the characters in str converted to lowercase
*/
string lowercase(string str)
{
   string result = str; // Make a copy of str
   for (int i = 0; i < result.length(); i++)
   {
      result[i] = tolower(result[i]); // Convert each character to lowercase
   }
   return result;
}

string firstDoubledVowel(string s)
{



}
