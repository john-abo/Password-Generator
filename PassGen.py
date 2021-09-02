# Password generator that takes advantage of the idea that 4 random
# words would provide better security than a single word employing
# 'l33t speak'. This generator will also employ l33t speak along with
# the use of 4 words, as opposed to the Java version that does not.
import random
gen = ""
for i in range(4):
    file = open("dict.txt")
    for j in range(random.randint(0, 10000)):
        read = file.readline()
    gen += read
gen = gen.replace('\n','_');

#time for some leet speak lols

gen = gen.replace('s','$');
gen = gen.replace('S','$');

gen = gen.replace('a','@');
gen = gen.replace('A','4');

gen = gen.replace('i','1');
gen = gen.replace('I','1');

gen = gen.replace('o','0');
gen = gen.replace('O','0');

gen = gen.replace('e','3');
gen = gen.replace('E','3');

print("gen: \"" + gen + "\", Length: " + str(len(gen)))

if len(gen) < 25:
    print("\tThe password generated may be too short")
