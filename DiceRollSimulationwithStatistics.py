import random
from collections import Counter

def roll_dice():
    return random.randint(1, 6)

def track_rolls(rolls):
    return Counter(rolls)

def calculate_statistics(rolls):
    stats = {}
    stats["average"] = sum(rolls) / len(rolls)
    stats["frequency"] = track_rolls(rolls)
    stats["probability"] = {num: count / len(rolls) for num, count in stats["frequency"].items()}
    return stats

def main():
    num_rolls = int(input("Enter the number of dice rolls: "))
    rolls = [roll_dice() for _ in range(num_rolls)]
    stats = calculate_statistics(rolls)
    
    print("Rolls:", rolls)
    print("Average:", stats["average"])
    print("Frequency:", stats["frequency"])
    print("Probability:", stats["probability"])

main()
