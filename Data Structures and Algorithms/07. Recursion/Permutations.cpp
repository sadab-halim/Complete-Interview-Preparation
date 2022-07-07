class Solution {
private:
    void solve(vector<int> nums, int index, vector<vector<int>>& res){
        //base case
        if(index >= nums.size()){
            res.push_back(nums);
            return;
        }
        
        for(int j = index; j < nums.size(); j++){
            swap(nums[index], nums[j]);
            solve(nums, index + 1, res);
            //backtracking
            swap(nums[index], nums[j]);
        }
    }
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> res;
        int index = 0;
        solve(nums, index, res);
        return res;
    }
};