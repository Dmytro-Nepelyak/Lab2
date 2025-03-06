public class Main {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Будь ласка, надайте 3 аргументи: <кількість рядків> <кількість стовпців> <розмір вектора>");
            return;
        }

        // створення та заповнення матриці
        System.out.println("Елементи матриці:");
        int rows = Integer.parseInt(args[0]);
        int cols = Integer.parseInt(args[1]);
        double[][] matrix = new double[rows][Math.min(cols, Integer.parseInt(args[2]))];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.random();
                System.out.printf("Елемент [%d][%d]: %f %n", i, j, matrix[i][j]);
            }
        }

        // створення вектора
        System.out.printf("%n%nЕлементи вектора:");
        int vectorSize = Integer.parseInt(args[2]);
        double[] vector = new double[vectorSize];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
            System.out.printf("Елемент [%d]: %f %n",i, vector[i]);
        }

        double[] result = new double[rows];
        System.out.printf("%n%nРезультат: %n");
        // множення матриці на вектор
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[0].length; j++) result[i] += matrix[i][j] * vector[j];
            System.out.printf("[%d]: %f %n", i, result[i]);
        }
    }
}
