class Solution {
private:
    void solve(vector<int> nums, vector<int> output, int index, vector<vector<int>>& res){
        //base case
        if(index >= nums.size()){
            res.push_back(output);
            return;
        }
        
        //exclude
        solve(nums, output, index + 1, res);
        
        //include
        int elem = nums[index];
        output.push_back(elem);
        solve(nums, output, index + 1, res);
    }
    
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<vector<int>> res;
        int index = 0;
        vector<int> output;
        solve(nums, output, index, res);
        return res;    
    }
};