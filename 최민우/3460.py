for _ in range(int(input())):
    input_int = int(input())
    bin_input = bin(input_int)
    for index in range(len(bin_input)):
        if bin_input[-1-index] == '1':
            print(index, end=' ')
