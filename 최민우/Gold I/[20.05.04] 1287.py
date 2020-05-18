raw_string = input()

try:
    var_string = raw_string.replace('/', '&').replace('*', '&').replace('+', '&').replace('-', '&')
    eval(var_string)
    print(int(eval(raw_string.replace('/', '//'))))
except:
    print('ROCK')
