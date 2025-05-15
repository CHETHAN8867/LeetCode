class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> num_map; // map to store number and its index
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (num_map.find(complement) != num_map.end()) {
                return {num_map[complement], i}; // return indices of complement and current number
            }
            num_map[nums[i]] = i; // store the number with its index
        }
        return {}; // return empty if no solution found (shouldn't happen per constraints)
    }
};

