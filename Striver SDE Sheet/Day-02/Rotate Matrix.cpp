class Solution {
public:    
    void rotate(vector<vector<int>>& matrix) {
        int mat_len = matrix.size();
        
        for(int i = 0; i < mat_len; i++)
            for(int j = 0; j < i; j++)
                swap(matrix[i][j], matrix[j][i]);
            
        for(int i = 0; i < mat_len; i++)
            reverse(matrix[i].begin(), matrix[i].end());
    }
};