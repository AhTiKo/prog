# Is it point located in circle with center (8,-10) and radius 5
# Iskren Varbanov 8012

x0 = 8
y0 = -10
r = 5
while 1:
	try:
		x = int(input("Input point's coordinate x: "))
		y = int(input("Input point's coordinate y: "))
		break
	except NameError:
		print "Invalid coordinate, try again!"
if (x0 - x)**2 + (y0 - y)**2 <= r*r:
	print ("The point is in the circle")
else:
	print ("The point is outside the circle")
 
