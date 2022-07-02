/* ------- TWO SUM -------*/
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example:
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

/* ------- T.C:O(n), A.S:O(n) -------*/
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> index;
        for(int i = 0; i < nums.size(); i++){
            if(index.find(target - nums[i]) != index.end())
                return {index[target - nums[i]], i};
            index[nums[i]] = i;
        }
        return {};
    }
};