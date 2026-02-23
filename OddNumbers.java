public static void oddNumberAnalysis() {

        int sum = 0;
        int count = 0;

        System.out.print("Odd Numbers between 1 and 50: ");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
        }

        System.out.println();

        System.out.println("Three Minimum Odd Numbers: 1, 3, 5");
        System.out.println("Three Maximum Odd Numbers: 45, 47, 49");

        double average = (double) sum / count;
        System.out.println("Average of Odd Numbers: " + average);
    }
}
