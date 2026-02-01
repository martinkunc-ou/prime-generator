public class Main {

    public int generatePrime() {
        return 17;
    }

    public int[] generatePrimes(int count) {
        int[] primes = new int[count];
        int candidate = 2;
        int index = 0;

        while (index < count) {
            if (isPrime(candidate)) {
                primes[index] = candidate;
                index++;
            }
            candidate++;
        }

        return primes;
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String... args) {
        Main primeGenerator = new Main();
        
        if (args.length == 0) {
            System.out.println(primeGenerator.generatePrime());
        } else {
            try {
                int count = Integer.parseInt(args[0]);
                int[] primes = primeGenerator.generatePrimes(count);
                for (int prime : primes) {
                    System.out.println(prime);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please provide a number.");
                System.exit(1);
            }
        }
    }

}