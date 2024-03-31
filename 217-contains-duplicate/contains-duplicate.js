/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let se = new Set(nums);
    return nums.length!=se.size;
};