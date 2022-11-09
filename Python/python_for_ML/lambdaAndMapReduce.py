import sys
from functools import reduce


# General function
def f(x, y):
    return x + y


print(f(1, 4))  # 5

# Lambda function
# 함수 이름 없이, 함수처럼 쓸 수 있는 익명함수
f = lambda x, y: x + y
print(f(1, 4))  # 5

f = lambda x: x ** 2  # 제곱
print(f(3))  # 9

f = lambda x: x / 2
print(f(3))  # 1.5

print((lambda x: x + 1)(5))  # 6

# Map
ex = [1, 2, 3, 4, 5]  # 시퀀스 자료형
f = lambda x: x ** 2
print(list(map(f, ex)))  # [1, 4, 9, 16, 25]

f = lambda x, y: x + y
print(list(map(f, ex, ex)))  # 두개의 리스트가 인덱스별로 각각 더해짐
# [2, 4, 6, 8, 10]

print(list(map(
    lambda x: x ** 2 if x % 2 == 0 else x,
    ex)))
# 조건을 만족할때는 제곱, 만족하지 않을 때는 x 반환
# [1, 4, 3, 16, 5]

# python3에서는 list를 꼭 붙여줘야 함
print(list(map(lambda x: x + x, ex)))  # [2, 4, 6, 8, 10]
print(map(lambda x: x + x, ex))  # <map object at 0x0000014BBA043850>

# for문으로 print
f = lambda x: x ** 2
print(map(f, ex))  # <map object at 0x000001555B9C3280>
for i in map(f, ex):
    print(i)
# 1
# 4
# 9
# 16
# 25

result = map(f, ex)
print(result)  # <map object at 0x000002D9769E3280>
iter_num = 0
max_iter = 5
while iter_num < max_iter:
    print(next(result))
    iter_num += 1
# 1
# 4
# 9
# 16
# 25

print(sys.getsizeof(ex))  # 96
print(sys.getsizeof((map(lambda x: x + x, ex))))  # 48
print(sys.getsizeof(list(map(lambda x: x + x, ex))))  # 120

# Reduce function
print(reduce(lambda x, y: x + y, [1, 2, 3, 4, 5]))  # 15


def factorial(n):
    return reduce(
        lambda x, y: x * y, range(1, n + 1))


print(factorial(5))  # 120
