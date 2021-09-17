nums = list(map(int, input("enter the array elements:\n").split()))
num  = int(input("enter the num to find pos:\n"))
pos = []
for i in range(len(nums)):
    if nums[i] == num:
        pos.append(i)
    
if len(pos) == 0:
    print("number not found")
else:
    print(pos)



