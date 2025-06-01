def alphabet_in_string(string):

    arr = [-1]*26
    count = 0
    for char in string:
        if arr[ord(char)-97] == -1:
            arr[ord(char)-97] = count

        count+=1

    return arr

string = input()
print(*alphabet_in_string(string))
