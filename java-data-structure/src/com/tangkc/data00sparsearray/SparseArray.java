package com.tangkc.data00sparsearray;

/**
 * @author tangkc
 * @description 稀疏数组
 * @date 2020/10/25 15:56
 */
public class SparseArray {

    public static void main(String[] args) {
        int twoArr[][] = new int[11][11];
        twoArr[1][2] = 1;
        twoArr[2][3] = 2;
        twoArr[4][5] = 2;
        System.out.println("原始数组===>");
        printArr(twoArr);

        // 1、统计出非0总数
        int sum = 0;
        for (int[] arr:twoArr){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0){
                    sum++;
                }
            }
        }
        // 2、构建稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        // 初始化第一行数据
        sparseArr[0][0] = twoArr.length;
        sparseArr[0][1] = twoArr[0].length;
        sparseArr[0][2] = sum;
        // 填充值
        int count = 0;
        for (int i = 0; i < twoArr.length; i++) {
            int[] arr = twoArr[i];
            for (int j = 0; j < arr.length; j++) {
                if(twoArr[i][j] != 0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = twoArr[i][j];
                }
            }
        }
        System.out.println("稀疏数组===>");
        printArr(sparseArr);

        // 稀疏数组还原
        int result[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for (int i = 1; i < sparseArr.length; i++) {
            int[] arr = sparseArr[i];
            for (int j = 0; j < arr.length; j++) {
                result[arr[0]][arr[1]] = arr[2];
            }
        }
        System.out.println("还原后数组===>");
        printArr(result);
    }

    /**
     * 打印二维数组
     */
    public static void printArr(int[][] twoArr){
        int xSize = twoArr.length;
        for (int[] arr : twoArr){
            StringBuilder printSbd = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                printSbd.append(arr[i]+"\t");
            }
            System.out.println(printSbd);
        }
    }
}
