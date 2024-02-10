public class Main {


            public static void main(String[] args) {
                int minRange = 100; // Kontrol edilecek minimum aralık
                int maxRange = 999; // Kontrol edilecek maksimum aralık

                System.out.println("Armstrong Sayıları:");

                for (int i = minRange; i <= maxRange; i++) {
                    if (isArmstrong(i)) {
                        System.out.println(i);
                    }
                }
            }

            // Bir sayının Armstrong sayısı olup olmadığını kontrol eden metot
            public static boolean isArmstrong(int number) {
                int originalNumber, remainder, result = 0, digits = 0;

                // Sayının basamak sayısını bulma
                originalNumber = number;
                while (originalNumber != 0) {
                    originalNumber /= 10;
                    ++digits;
                }

                // Armstrong sayısı kontrolü
                originalNumber = number;
                while (originalNumber != 0) {
                    remainder = originalNumber % 10;
                    result += Math.pow(remainder, digits);
                    originalNumber /= 10;
                }

                return result == number;
            }



}