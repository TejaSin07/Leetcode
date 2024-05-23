class Solution:
	def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
		result = []
		for i in range(len(nums1)):
			start = False
			for j in range(len(nums2)):
				if nums1[i]==nums2[j]:
					start = True
				if start and nums2[j] > nums1[i]:
					result.append(nums2[j])
					start = False
					break
			if start==True:
				result.append(-1)
		return result