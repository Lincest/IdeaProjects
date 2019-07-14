public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组11*11
        //0表示没有棋子，1表示黑色棋子，2表示蓝色棋子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        for(int[] row:chessArr1){
            for(int data:row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }//原始的二维数组

        //将二维数组转化成稀疏数组
        int sum = 0;
        for(int i=0;i<11;++i)
            for(int j=0;j<11;++j)
            {
                if(chessArr1[i][j]!=0)
                {
                    sum++;
                }
            }
        System.out.println("sum="+sum);

        //创建稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        //遍历二维数组并将非零的值存入sparseArr中
        int count=0;
        for(int i=0;i<11;++i)
            for(int j=0;j<11;j++)
            {
                if(chessArr1[i][j]!=0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        System.out.println();
        System.out.println("得到的稀疏数组为：");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);

        }
        System.out.println();
    }
}