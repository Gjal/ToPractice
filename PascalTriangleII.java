public class PascalTriangleII{
    public List<Integer> getRow(int rowIndex){
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
    }
}
