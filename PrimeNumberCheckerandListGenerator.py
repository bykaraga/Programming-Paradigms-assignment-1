def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def generate_primes(limit):
    return [num for num in range(2, limit + 1) if is_prime(num)]

def main():
    limit = int(input("Enter a limit: "))
    print(f"Prime numbers up to {limit}: {generate_primes(limit)}")

main()
