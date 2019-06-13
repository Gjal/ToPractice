public class PascalTriangleII{
    //method one
  /*  public List<Integer> getRow(int rowIndex){
        List<Integer> row=new ArrayList<Integer>();
        if(rowIndex==0){
            row.add(1);
            return row;
        }

        if(rowIndex==1){
            row.add(1);
            row.add(1);
            return row;
        }

        row.add(1);
        row.add(1);
        for(int i=1;i<rowIndex;i++){
            row.add(1);
            for(int j=0;j<i;j++){
                row.add(row.get(0)+row.get(1));
                row.remove(0);
            }
            row.add(1);
            row.remove(0);
        }
        return row;
    }*/

    //method two
    public List<Integer> getRow(int rowIndex){
        List<Integer> row=new ArrayList<Integer>();
        for(int i=0;i<rowIndex+1;i++){
            row.add(0,1);
            for(int j=1;j<i;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
        }
        return row;
    }
}
