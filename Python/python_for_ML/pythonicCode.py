colors = ["red", "blue", "green", "yellow"]

# 일반 코드
result = ""
for s in colors:
    result += s
print(result)

# pythonic code
result = "".join(colors)
print(result)
