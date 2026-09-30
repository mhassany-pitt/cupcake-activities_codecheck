#include <vector>
using namespace std;

/** Helper function. Check if a subrange is all zeros. */
bool all_zeros(const vector<vector<int>>& v, int r1, int c1, int r2, int c2);

/**
   Return upper-left corner and area of largest zero-filled rectangle.
   @param v the vector<vector<int>> to process.
   @return {-1, -1, -1} if no zero-filled squares.
*/
vector<int> start_of_largest_zero_rectangle_vector(const vector<vector<int>>& v)
{
    // Your code here...
}
/** Helpber function. */
bool all_zeros(const vector<vector<int>>& v, int r1, int c1, int r2, int c2)
{
   for (int r = r1; r <= r2; r++)
   {
      for (int c = c1; c <= c2; c++)
      {
         if (v[r][c] != 0) { return false; }
      }
   }
   return true;
}
