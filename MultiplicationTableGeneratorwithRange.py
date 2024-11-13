def get_range():
    start = int(input("Enter the start of range: "))
    end = int(input("Enter the end of range: "))
    return start, end

def generate_table(number):
    return [number * i for i in range(1, 11)]

def display_tables(start, end):
    for num in range(start, end + 1):
        print(f"\nMultiplication Table for {num}:")
        for i, result in enumerate(generate_table(num), 1):
            print(f"{num} x {i} = {result}")

def main():
    start, end = get_range()
    display_tables(start, end)

main()
