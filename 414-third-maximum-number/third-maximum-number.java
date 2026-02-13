class Solution {
    public int thirdMax(int[] nums) {
    List<Integer> lst  = Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    if(lst.size()<=2)return lst.get(0);
    return lst.get(2);

    }
}