class Solution {
    public int islandPerimeter(int[][] grid) {

        int rez =0;
        int tmp =0;
        int col=0;
        for (int i=0; i<grid.length; i++){
            for (int j=0; j<grid[i].length; j++){
                
                if(grid[i][j]==1){
                    tmp++;
                if(i!=grid.length-1&&grid[i+1][j]==1){
                     System.out.println((i+1)+" "+j);
                    col+=2;
                }
                if(j!=grid[i].length-1&&grid[i][j+1]==1){
                     System.out.println(i+" "+ (j+1));
                    col+=2;
                }
            }
              
        }
        }
        System.out.println(col);
        int total = tmp*4;
        return total - col;
        
    }
}