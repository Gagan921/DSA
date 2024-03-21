class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        len_ = len(matrix)
        
        # Rotate Matrix
        for idx1 in range(0, len_):
            for idx2 in range(idx1+1, len_):
                t = matrix[idx2][idx1]
                matrix[idx2][idx1] = matrix[idx1][idx2]
                matrix[idx1][idx2] = t
        
        # Reverse Matrix
        for i in range(len_):
            matrix[i].reverse()