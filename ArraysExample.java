import java.util.List;

public class ArraysExample {
        public static void main(String[] args) {

                // 1D array
                int nums[] = { 3, 7, 2, 4 };
                System.out.println("1D Array Element: " + nums[0]);

                int num[] = new int[4];
                num[0] = 9;
                num[1] = 0;
                num[2] = 7;
                num[3] = 5;

                System.out.println("1D Array with loop:");
                for (int i = 0; i < num.length; i++) {
                        System.out.println("num[" + i + "] = " + num[i]);
                }

                System.out.println("\n1D Array with enhanced for loop:");
                for (int element : nums) {
                        System.out.println(element);
                }

                // 2D array
                System.out.println("\n2D Array:");
                int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

                for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                                System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                }

                System.out.println("2D Array with enhanced for loop:");
                for (int[] row : matrix) {
                        for (int value : row) {
                                System.out.print(value + " ");
                        }
                        System.out.println();
                }

                // Jagged array
                System.out.println("\nJagged Array:");
                int[][] jagged = { { 1, 2 }, { 3, 4, 5 }, { 6 } };

                for (int i = 0; i < jagged.length; i++) {
                        for (int j = 0; j < jagged[i].length; j++) {
                                System.out.print(jagged[i][j] + " ");
                        }
                        System.out.println();
                }

                System.out.println("Jagged Array with enhanced for loop:");
                for (int[] row : jagged) {
                        for (int value : row) {
                                System.out.print(value + " ");
                        }
                        System.out.println();
                }

                // String arrays
                System.out.println("\nString Array:");
                String[] names = { "Alice", "Bob", "Charlie" };
                for (String name : names) {
                        System.out.println(name);
                }

                System.out.println("\n2D String Array:");
                String[][] stringMatrix = { { "A", "B", "C" }, { "D", "E", "F" } };
                for (String[] row : stringMatrix) {
                        for (String value : row) {
                                System.out.print(value + " ");
                        }
                        System.out.println();
                }

                System.out.println("\nJagged String Array:");
                String[][] jaggedStrings = { { "Hello" }, { "World", "Java" }, { "Programming", "is", "fun" } };
                for (String[] row : jaggedStrings) {
                        for (String value : row) {
                                System.out.print(value + " ");
                        }
                        System.out.println();
                }
        }

        public static List<Integer> asList(int i, int j, int k, int l, int m) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'asList'");
        }

        public static List<String> asList(String string, String string2, String string3, String string4) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'asList'");
        }
}
