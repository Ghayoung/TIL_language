result = []

# for loop + append 사용하기
for i in range(10):
    result.append(i)
print(result)  # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

# list Comprehension 사용하기
result = [i for i in range(10)]
print(result)  # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

result = [i for i in range(10) if i % 2 == 0]
print(result)  # [0, 2, 4, 6, 8]

# Nested For loop
word_1 = "Hello"
word_2 = "World"
result = [i + j for i in word_1 for j in word_2]
print(result)
# ['HW', 'Ho', 'Hr', 'Hl', 'Hd', 'eW', 'eo', 'er', 'el', 'ed', 'lW', 'lo', 'lr', 'll', 'ld', 'lW', 'lo', 'lr', 'll',
# 'ld', 'oW', 'oo', 'or', 'ol', 'od']

case_1 = ["A", "B", "C"]
case_2 = ["D", "E", "A"]
result = [i + j for i in case_1 for j in case_2]
print(result)  # ['AD', 'AE', 'AA', 'BD', 'BE', 'BA', 'CD', 'CE', 'CA']

# Nested For loop + if 문
result = [i + j for i in case_1 for j in case_2 if not (i == j)]
result.sort()
print(result)  # ['AD', 'AE', 'BA', 'BD', 'BE', 'CA', 'CD', 'CE']

# 2차원 list
result = [[i+j for i in case_1] for j in case_2]
print(result) # [['AD', 'BD', 'CD'], ['AE', 'BE', 'CE'], ['AA', 'BA', 'CA']]

# split + list Comprehension
words = 'The quick brown fox jumps over the lazy dog'.split()
print(words)  # ['The', 'quick', 'brown', 'fox', 'jumps', 'over', 'the', 'lazy', 'dog']

# list의 각 element들을 대문자, 소문자, 길이로 변환하여 two dimensional list로 변환
stuff = [[w.upper(), w.lower(), len(w)] for w in words]

for i in stuff:
    print(i)

# ['THE', 'the', 3]
# ['QUICK', 'quick', 5]
# ['BROWN', 'brown', 5]
# ['FOX', 'fox', 3]
# ['JUMPS', 'jumps', 5]
# ['OVER', 'over', 4]
# ['THE', 'the', 3]
# ['LAZY', 'lazy', 4]
# ['DOG', 'dog', 3]
