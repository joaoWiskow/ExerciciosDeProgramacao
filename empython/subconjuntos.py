import time

def subset_sum(nums, target):
    n = len(nums)
    iterations = 0
    operations = 0
    solutions = []

    def backtrack(index, current, total):
        nonlocal iterations, operations
        iterations += 1
        operations += 1  
        if total == target:
            solutions.append(current[:])
            operations += 1 
            return
        if total > target or index == n:
            operations += 1 
            return
        current.append(nums[index])
        operations += 1 
        backtrack(index + 1, current, total + nums[index])
        current.pop()
        operations += 1  
        
        backtrack(index + 1, current, total)

    start_time = time.time()
    backtrack(0, [], 0)
    end_time = time.time()
    tempo_ms = (end_time - start_time) * 1000
    print(f"{n}\t{iterations}\t{operations}\t{tempo_ms:.3f}")


nums = [4,7,3,6,2]
target = 10
subset_sum(nums, target)
