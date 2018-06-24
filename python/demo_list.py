
#def f(x):
	#return x % 2 == 0 and x % 3 == 0
	
#print(filter(f, range(1,100)))

#def cube(x):
	#return x*x*x

#print((map, range(1,11)))

#seq = range(11)
#def add(x, y):
	#return x + y

#print(map(add, seq, seq))
#print 'Sum: ',reduce(add,seq)

#seq = []
#for i in range(1,11):
	#seq.append(i*i)
#print seq

#print[x*x for x in range(1,11)]

#print(map(lambda x: x**2,range(1,11)))


arr= [1, 23, 2, 13, 45, 65, 3, 2, 8]

#print[(x, y) for x in [1,2,3] for y in [1,2,3] if x != y]

#vec = [-4 , 1 , 0, -3, 8]
#print vec

#print[x*2 for x in vec]
#print[x for x in vec if x >= 0]
#print[abs(x) for x in vec]

#s = ['  asd   ', ' sas  sas   ', 'f  fsdfd   ', '   d as']
#print[x.strip() for x in s]

#print[(x,x*3) for x in range(6)]

#vec2 = [[1,2,3], [4,5,6], [7,8,9]]
#print[num for elem in vec2 for num in elem]

#from math import pi
#print[str(round(pi,i)) for i in range(2,9)]

def min_value(x,y):
	if x <= y:
		return x
	return y
for i in range(len(arr)):
	x = reduce(min_value,arr)
	print x,
	arr.remove(x)

