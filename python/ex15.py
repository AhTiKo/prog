from sys import argv

script, file_name = argv
txt = open(file_name)
print "Here's your file %r" %file_name
print txt.read()

print "Type file name again:"
file_again = raw_input("> ")

txt = open(file_again)
print txt.read()
