#include <cstdio>
#include <cstdint>
#include <cmath>

uint64_t isPrime(uint64_t n)
{
	for (uint64_t i = 3; i <= sqrt(n); i += 2) {
		if (!(n%i))
			return i;
	}
	return 0;
}

int main() {

	printf("\n==========================================\n");
	printf("\nIs (2^prime_num)-1 always be prime number?\n");
	printf("\n==========================================\n");

	printf("\nThis test just test < 2^64 due to limitations\n\n");

	uint8_t primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
	uint64_t power = 0;
	uint64_t div = 0;

	for (uint8_t i = 2; i <= 64; i++) {
		power = pow(2,i)-1;

		div = isPrime(power);
		if (div == 0)
			printf("2^%u = %lu is Prime\n",i,power);
		else if (div > 0)
			printf("2^%u = %lu is NOT Prime and can be devided by %lu\n",i,power,div);
	}

	return 0;
}
