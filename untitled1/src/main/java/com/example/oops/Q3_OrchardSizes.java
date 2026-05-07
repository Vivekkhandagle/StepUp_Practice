package com.example.oops;

public class Q3_OrchardSizes {



        static int rows, cols;


//          DFS function to explore all connected 'T' cells
//          and return the size of the orchard

        public static int dfs(char[][] grid, int i, int j, boolean[][] visited) {

            // Boundary check + visited check + only process 'T'
            if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] || grid[i][j] != 'T') {
                return 0;
            }

            // Mark current cell as visited
            visited[i][j] = true;

            // Count current tree
            int count = 1;

            // Explore all 8 directions
            int[] rowDir = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] colDir = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int d = 0; d < 8; d++) {
                count += dfs(grid, i + rowDir[d], j + colDir[d], visited);
            }

            return count;
        }

        public static void main(String[] args) {

            // Given matrix
            char[][] grid = {
                    {'O','T','O','O'},
                    {'O','T','O','T'},
                    {'T','T','O','T'},
                    {'O','T','O','T'}
            };

            rows = grid.length;
            cols = grid[0].length;

            // Visited array to avoid re-processing
            boolean[][] visited = new boolean[rows][cols];

            System.out.println("Sizes of all orchards:");

            // Traverse entire matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {

                    // If we find an unvisited tree
                    if (grid[i][j] == 'T' && !visited[i][j]) {

                        // Compute orchard size using DFS
                        int size = dfs(grid, i, j, visited);

                        // Print result
                        System.out.print(size + " ");
                    }
                }
            }
        }
    }

