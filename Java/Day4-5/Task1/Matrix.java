package Learning;

public class Matrix {
	private int[][] matrix;

    
    public Matrix(int rows, int cols) {
        this.matrix = new int[rows][cols];
    }

    
    public void fillMatrix(int[][] values) {
        if (values.length != matrix.length || values[0].length != matrix[0].length) {
            System.out.println("Input values array dimensions do not match matrix dimensions.");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = values[i][j];
            }
        }
    }

   
    public void displayMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int rows = 3;
        int cols = 3;
        Matrix matrix = new Matrix(rows, cols);
        
        int[][] values = {
            {5, 5, 3},
            {8, 5, 6},
            {8, 8, 9}
        };
        
        matrix.fillMatrix(values);
        matrix.displayMatrix();
    }

}
