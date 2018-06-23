# Finding the roots of a square equation
# Iskren Varbanov 8012

import math

while 1:
	try:
		a = int(input("Iput coefficient a: "))
		b = int(input("Iput coefficient b: "))
		c = int(input("Iput coefficient c: "))
		break
	except NameError:
		print "Invalid number, try again!"

d = b*b - 4*a*c

if d < 0:
	print ("The equation has no real roots!")
elif d == 0:
	x = -b/(2*a)
	print ("The equation has one real root")
	print ("x = ",x)
else:
	x1 = (-b + math.sqrt(b*b - 4*a*c))/ (2*a)
	x2 = (-b - math.sqrt(b*b - 4*a*c))/ (2*a)
	print ("The equation has two real root")
	print ('x1 = %f' %x1)
	print ('x2 = %f' %x2)
 
