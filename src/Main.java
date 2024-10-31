public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1.1");
        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        System.out.println();
        System.out.println("Task 1.2");
        double[] doubleArr = {1.57, 7.654, 9.986};
        System.out.println();
        System.out.println("Task 1.3");
        String[] cars = {"Lada", "Mazda", "BMW"};
        System.out.println();
        System.out.println("Task 2");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubleArr.length; i++) {
            System.out.print(doubleArr[i]);
            if (i < doubleArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]);
            if (i < cars.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 3");
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.print(cars[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr[i] += 1;
            }
        }

        System.out.print("Преобразованный массив : ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            if (i < intArr.length - 1) {
                System.out.print(", ");
            }
        }

    }
}