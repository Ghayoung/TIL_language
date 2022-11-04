#빈칸을 기준으로 문자열 나누기
items = 'zero one two three'.split()
print(items)

#","을 기준으로 문자열 나누기
example = 'python,jquery,javascript'
print(example.split(","))

#리스트의 각 값을 a,b,c 변수로 unpacking
example = 'python,jquery,javascript'
a,b,c = example.split(",")
print(a)
print(b)
print(c)

#"."을 기준으로 문자열 나누고 unpacking
example = 'cs.gachon.edu'
subdomain,domain,tld = example.split(".")
print(subdomain)
print(domain)
print(tld)

##join

colors = ['red', 'blue', 'green', 'yellow']
result = ''.join(colors)
print(result)

#연결 시 빈칸 1칸으로 연결
result = ' '.join(colors)
print(result)

#연결 시 ", "으로 연결
result = ', '.join(colors)
print(result)

#연결 시 "-"으로 연결
result = '-'.join(colors)
print(result)