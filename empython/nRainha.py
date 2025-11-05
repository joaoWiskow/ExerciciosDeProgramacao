import time

def n_queens(n):
    board = [-1] * n
    iterations = 0
    operations = 0

    def is_safe(row, col):
        nonlocal iterations, operations
        iterations += 1
        for i in range(row):
            operations += 1
            if board[i] == col or abs(board[i] - col) == row - i:
                return False
        return True

    solutions = []

    def backtrack(row):
        nonlocal iterations, operations
        if row == n:
            solutions.append(board[:])
            operations += 1  
            return
        for col in range(n):
            operations += 1  
            if is_safe(row, col):
                board[row] = col
                operations += 1 
                backtrack(row + 1)
                board[row] = -1  
                operations += 1  

    start_time = time.time()
    backtrack(0)
    end_time = time.time()

    tempo_ms = (end_time - start_time) * 1000
    print(f"{n}\t{iterations}\t{operations}\t{tempo_ms:.3f}")


for i in range(4, 9):  
    n_queens(i)
