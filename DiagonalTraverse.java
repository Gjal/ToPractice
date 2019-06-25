//498.对角线遍历
public class DiagonalTraverse{
    public int[] findDiagonalOrder(int[][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;
        int r=0,c=0;
        int ans[]=new int[row*col];
        for(int i=0;i<row*col;i++){
            ans[i]=matrix[r][c];
            if((r+c)%2==0){
                if(r==0){
                    c++;
                }else if(c==col-1){
                    r++;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r==0){
                    r++;
                }else if(r==row-1){
                    c++;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}
