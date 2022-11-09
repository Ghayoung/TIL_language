from collections import deque, OrderedDict, defaultdict, Counter, namedtuple

# deque
deque_list = deque()
for i in range(5):
    deque_list.append(i)
print(deque_list)  # deque([0, 1, 2, 3, 4])

deque_list.appendleft(10)
print(deque_list)  # deque([10, 0, 1, 2, 3, 4])

deque_list.rotate(2)
print(deque_list)  # deque([3, 4, 10, 0, 1, 2])
deque_list.rotate(2)
print(deque_list)  # deque([1, 2, 3, 4, 10, 0])

print(deque_list)  # deque([1, 2, 3, 4, 10, 0])
print(deque(reversed(deque_list)))  # deque([0, 10, 4, 3, 2, 1])

deque_list.extend([5, 6, 7])
print(deque_list)  # deque([1, 2, 3, 4, 10, 0, 5, 6, 7])

deque_list.extendleft([5, 6, 7])
print(deque_list)  # deque([7, 6, 5, 1, 2, 3, 4, 10, 0, 5, 6, 7])


# OrderedDict
d = {}
d['x'] = 100
d['y'] = 200
d['z'] = 300
d['l'] = 500

for k, v in d.items():
    print(k, v)
# x 100
# y 200
# z 300
# l 500

d = OrderedDict()
d['x'] = 100
d['y'] = 200
d['z'] = 300
d['l'] = 500

for k, v in d.items():
    print(k, v)
# x 100
# y 200
# z 300
# l 500

for k, v in OrderedDict(sorted(d.items(), key=lambda t: t[0])).items():
    print(k, v)
# l 500
# x 100
# y 200
# z 300

for k, v in OrderedDict(sorted(d.items(), reverse=True, key=lambda t: t[1])).items():
    print(k, v)
# l 500
# z 300
# y 200
# x 100


# defaultdict
d = defaultdict(object)
d = defaultdict(lambda: 1)
print(d["first"])  # 1


# Counter
c = Counter()
c = Counter('gallahad')
print(c)  # Counter({'a': 3, 'l': 2, 'g': 1, 'h': 1, 'd': 1})

c = Counter({'red': 4, 'blue': 2})
print(c)  # Counter({'red': 4, 'blue': 2})
print(list(c.elements()))  # ['red', 'red', 'red', 'red', 'blue', 'blue']

c = Counter(a=4, b=2, c=0, d=-2)
d = Counter(a=1, b=2, c=3, d=4)
print(c + d)  # Counter({'a': 5, 'b': 4, 'c': 3, 'd': 2})
print(c & d)  # Counter({'b': 2, 'a': 1})
print(c | d)  # Counter({'a': 4, 'd': 4, 'c': 3, 'b': 2})


# namedtuple
Point = namedtuple('Point', ['x', 'y'])
p = Point(11, y=22)
print(p[0] + p[1])  # 33

x, y = p
print(x, y)  # 11 22
print(p.x + p.y)  # 33
print(Point(x=11, y=22))  # Point(x=11, y=22)
