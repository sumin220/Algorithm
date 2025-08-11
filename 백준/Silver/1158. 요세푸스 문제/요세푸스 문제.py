import sys
input = sys.stdin.readline()

N, K = map(int, input.split())

people = list(range(1, N+1))
people_pop_list = []
current_index = K-1

while len(people)>0:
    current_index = current_index % len(people)
    people_pop_list.append(people.pop(current_index))
    current_index += K-1

result = ", ".join(map(str, people_pop_list))
print(f"<{result}>")