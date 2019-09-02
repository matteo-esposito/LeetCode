class Solution(object):
    def islandPerimeter(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        # Create perimeter of 0s for future collision count.
        for i in range(len(grid)):
            grid[i] = [0] + grid[i] + [0]
        grid = [[0]*len(grid[0])] + grid + [[0]*len(grid[0])]

        # Increment perimeter based on surrounding cells.
        perim = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    if grid[i][j-1] == 0:
                        perim += 1
                    if grid[i-1][j] == 0:
                        perim += 1
                    if grid[i+1][j] == 0:
                        perim += 1
                    if grid[i][j+1] == 0:
                        perim += 1

        return perim