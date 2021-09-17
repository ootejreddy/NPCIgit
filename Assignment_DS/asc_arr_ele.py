l = list(map(int, input("enter the array elements:\n").split()))
low = 0
high = len(l)-1
while(low<high):
    if l[low] > l[high]:
        l[low],l[high] = l[high],l[low]
    low += 1
    high -= 1

print(l) 