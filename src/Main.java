public class Main {
    public static void main(String[] args) {
        // Демонстрация обработки исключений,
        class ExcDemol {
            public void main(String args[]) {
                int nums[] = new int[4];

                // Создание блока try.
                System.out.println("Before exception is generated.");

                // Попытка обратиться за границы массива.
                nums[7] = 10;
                System.out.println("this won't be displayed");
                System.out.println("After catch statement.");
            }
        }



        System.out.println("Hello world!");
    }
}