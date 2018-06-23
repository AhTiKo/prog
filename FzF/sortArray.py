# Sort array
# Iskren Varbanov 8012

while 1:
	try:
		num = map(int, raw_input("Input array: ").split())
		break
	except ValueError:
		print "Incorrect number in array, try again!"

for i in range (len(num)):
	for j in range (len(num)-1-i):
		if num[j] > num[j+1]:
			temp = num[j]
			num[j] = num[j+1]
			num[j+1] = temp
print(num)

