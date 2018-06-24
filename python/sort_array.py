
while 1:
	try:
		x = raw_input("Enter array:").split()
		x = map(int,x)
		break
	except ValueError:
		print "Not correct input, try again..."
for i in range(len(x)):
	for j in range(len(x) - i - 1):
		if x[j] > x[j+1]:
			temp = x[j]
			x[j] = x[j+1]
			x[j+1] = temp
print x

