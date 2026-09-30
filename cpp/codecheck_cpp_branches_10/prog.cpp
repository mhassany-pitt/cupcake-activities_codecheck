#include <iostream>
using namespace std;

int main()
{
   int actualTime = 600; 
   int alarmTime = 1555; 

   . . .
   if (differenceInMinutes > 0)
      cout << differenceInMinutes << endl;
   else
      cout << "Alarm already went off" << endl;
   return 0;
}
