test = open("test.txt", "r")
variable = []
lines = test.readlines()
for line in lines:
    line = line.rstrip()
    for char in line:
        variable.append(char)
test.close()
print variable
print("Insira um caracter a ser procurado:")
userInput = input("")
