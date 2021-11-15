#include <cstdio>
#include <cstdint>
#include <cmath>

bool isPrime(uint64_t a)
{
	for (uint32_t i = 3; i <= sqrt(a); i += 2) {
		if (!(a%i))
			return false;
	}
	return true;
}

int main() {

	printf("\n==========================================\n");
	printf("\nIs (2^prime_num)-1 always be prime number?\n");
	printf("\n==========================================\n");

	printf("\nThis test just test < 2^64 due to limitations\n\n");

	uint8_t primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
	uint64_t power = 0;

	for (int a : primes) {
		power = pow(2,a)-1;
		isPrime(power);

		if (isPrime)
			printf("2^%u = %llu is Prime\n",a,power);
		else
			printf("2^%u = %llu is Prime\n",a,power);
	}

	return 0;
}
