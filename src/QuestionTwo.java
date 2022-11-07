public class QuestionTwo {
    public static void main(String[] args) {
        printArray(generateSpiralArray(5));
    }

    public static int[][] generateSpiralArray(int dimension) {
        int[][] spiralArray = new int[dimension][dimension];

        int squares = (int) Math.ceil((dimension) / 2.0);

        int j;
        int side = dimension;
        int current = 0;

        for (int i = 0; i < squares; i++) {
            /**
             * Top
             */
            for (j = 0; j < side; j++) {
                spiralArray[i][i + j] = current++;
            }


            /**
             * Right
             */
            for (j = 1; j < side; j++) {
                spiralArray[i + j][dimension - 1 - i] = current++;
            }


            /**
             * Bottom
             */
            for (j = side - 2; j > -1; j--) {
                spiralArray[dimension - 1 - i][i + j] = current++;
            }

            /**
             * Left
             */
            for (j = side - 2; j > 0; j--) {
                spiralArray[i + j][i] = current++;
            }

            side -= 2;
        }

        return spiralArray;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }
    }
}
