import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.math3.primes.Primes;

public class MainTest {

    private final Main primeGenerator = new Main();

    @Test
    public void testSinglePrimeGeneration() {
        int generatedPrime = primeGenerator.generatePrime();
        Assert.assertTrue(Primes.isPrime(generatedPrime));
    }

    @Test
    public void testMultiplePrimeGeneration() {
        int[] generatedPrimes = primeGenerator.generatePrimes(5);
        Assert.assertEquals(5, generatedPrimes.length);
        for (int prime : generatedPrimes) {
            Assert.assertTrue(Primes.isPrime(prime));
        }
    }
}