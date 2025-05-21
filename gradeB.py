def calculate_average(numbers):
    """Calculate the average of a list of numbers."""
    if not numbers:
        return 0  # Simple handling of empty list
    
    total = sum(numbers)
    average = total / len(numbers)
    return round(average, 2)  # Limiting decimal places

# Usage
data = [10, 20, 30, 40]
print(calculate_average(data))
