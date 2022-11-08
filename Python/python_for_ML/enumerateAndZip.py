# list에 있는 index와 값을 unpacking
for i, v in enumerate(['tic', 'tac', 'toe']):
    print(i, v)
# 0 tic
# 1 tac
# 2 toe

# list에 있는 index와 값을 unpacking하여 list로 저장
myList = ['a', 'b', 'c', 'd']
print(list(enumerate(myList)))
# [(0, 'a'), (1, 'b'), (2, 'c'), (3, 'd')]

# 문장을 list로 만들고 list의 index와 값을 unpacking하여 dict로 ㅈ장
print({i: j for i, j in enumerate('This is a book'.split())})
# {0: 'This', 1: 'is', 2: 'a', 3: 'book'}

# for loop + zip
alist = ['a1', 'a2', 'a3']
blist = ['b1', 'b2', 'b3']
for a, b in zip(alist, blist):
    print(a, b)
# 병렬적으로 값을 추출
# a1 b1
# a2 b2
# a3 b3

# list comprehension + zip
a, b, c = zip((1, 2, 3), (10, 20, 30), (100, 200, 300))
print(a, b, c)
# 각 tuple의 같은 index끼리 묶음
# (1, 10, 100) (2, 20, 200) (3, 30, 300)

print([sum(x) for x in zip((1, 2, 3), (10, 20, 30), (100, 200, 300))])
# 각 tuple의 같은 index를 묶어 합을 list로 변환
# [111, 222, 333]

# enumerate + zip
for i, (a, b) in enumerate(zip(alist, blist)):
    print(i, a, b)
# index alist[index] blist[index] 표시
# 0 a1 b1
# 1 a2 b2
# 2 a3 b3