#include <vector>
using namespace std;

/** Helper function. Check if a subrange is all zeros. */
bool all_zeros(const vector<vector<int>>& v, int r, int c, int k);

/**
   Return upper-left corner and area of largest zero-filled square.
   @param v the vector<vector<int>> to process.
   @return {-1, -1, -1} if no zero-filled squares.
*/
vector<int> start_of_largest_zero_square_vector(const vector<vector<int>>& v)
{
    // Your code here...
}
/** Helpber function. */
bool all_zeros(const vector<vector<int>>& v, int r, int c, int size)
{
   for (int i = 0; i < size; i++)
      for (int j = 0; j < size; j++)
         if (v[r + i][c + j] != 0) { return false; }
   return true;
}
