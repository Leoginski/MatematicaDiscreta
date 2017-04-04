test = open("test.txt", "r")
variable = []
lines = test.readlines()
for line in lines:
    line = line.rstrip()
    for char in line:
        variable.append(char)
test.close()
print variable
caracter = raw_input("Insira um caracter a ser procurado: ")
m=0
for e in variable:
 if caracter is e:
  m = m + 1
print (m)
