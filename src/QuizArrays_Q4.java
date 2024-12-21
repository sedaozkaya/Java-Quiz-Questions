public class QuizArrays_Q4 {
    public static void main(String[] args) {
        int[][] array = createArr();
        printArr(array);
    }

    public static int[][] createArr() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        int maxRowCount = -1, maxColCount = -1;
        int maxRow = -1, maxCol = -1;
        int[] rowMax = new int[arr.length];
        int[] colMax = new int[arr[0].length];

        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    rowCount++;
                }
            }
            rowMax[i] = rowCount;
            if (rowCount > maxRowCount) {
                maxRowCount = rowCount;
                maxRow = i;
            }
        }

        for (int j = 0; j < arr[0].length; j++) {
            int colCount = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == 1) {
                    colCount++;
                }
            }
            colMax[j] = colCount;
            if (colCount > maxColCount) {
                maxColCount = colCount;
                maxCol = j;
            }
        }


        for (int i = 0; i < rowMax.length; i++) {
            if (rowMax[i] == maxRowCount) {
                System.out.println("The largest row index is " + i);
            }
        }

        for (int j = 0; j < colMax.length; j++) {
            if (colMax[j] == maxColCount) {
                System.out.println("The largest column index is " + j);
            }
        }
    }
}
