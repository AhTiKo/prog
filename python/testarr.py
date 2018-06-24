num = map(int,raw_input("enter array: ").split())
for i in range(len(num)):
	for j in range(len(num) -1 - i):
		if num[j] > num [j + 1]:
			temp = num[j]
			num[j] = num [j + 1]
			num[j + 1] = temp
print(num)
