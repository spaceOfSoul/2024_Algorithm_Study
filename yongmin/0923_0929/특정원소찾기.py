import sys 

a = input().split(' ')
b = input().split(' ')

finder = a[1]

try:
    print(b.index(finder) + 1)
except:
    print(-1)