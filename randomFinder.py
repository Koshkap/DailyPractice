import random
rand_list=[]
n=random.randint(1,15)
for i in range(1,n):
    rand_list.append(i)
random_element = random.choice(rand_list)
rand_list.remove(random_element)
print(rand_list)
def find_missing(rand_list):
    max = rand_list[0]
    for i in rand_list:
        if i > max:
            max = i

    min = rand_list[0]
    for i in rand_list:
        if i < min:
            min = i
    for num in range(1, max+1):
        if num not in rand_list:
            rand_list.insert(num-1, num)
    return rand_list
print(find_missing(rand_list))
