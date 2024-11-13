def input_matrix(rows, cols):
    matrix = []
    for i in range(rows):
        row = list(map(int, input(f"Enter row {i+1}: ").split()))
        matrix.append(row)
    return matrix

def multiply_matrices(m1, m2):
    rows_m1, cols_m1 = len(m1), len(m1[0])
    rows_m2, cols_m2 = len(m2), len(m2[0])
    result = [[0] * cols_m2 for _ in range(rows_m1)]
    for i in range(rows_m1):
        for j in range(cols_m2):
            for k in range(cols_m1):
                result[i][j] += m1[i][k] * m2[k][j]
    return result

def display_matrix(matrix):
    for row in matrix:
        print(" ".join(map(str, row)))

def main():
    rows1, cols1 = map(int, input("Enter dimensions of first matrix: ").split())
    rows2, cols2 = map(int, input("Enter dimensions of second matrix: ").split())
    
    if cols1 != rows2:
        print("Matrices cannot be multiplied.")
        return
    
    print("Enter first matrix:")
    m1 = input_matrix(rows1, cols1)
    
    print("Enter second matrix:")
    m2 = input_matrix(rows2, cols2)
    
    print("Result of multiplication:")
    display_matrix(multiply_matrices(m1, m2))

main()
