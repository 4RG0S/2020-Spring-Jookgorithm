# Stack

# Created by 김노은 on 09/04/2020.
# Copyright © 2020 cnu.cse. All rights reserved.

rs_right = {')' : '(', '}':'{', ']':'['}
rs_left = ['(', '[', '{']

while True:
    tmp_array = []
    tmp_list = list(input())
    
    if tmp_list[0] == '.':
        break
    
    result = True
    for ps in tmp_list:
        if ps in rs_right:
            if len(tmp_array) > 0:
                previous_ps = tmp_array.pop()
                if previous_ps != rs_right[ps]:
                    result = False
                    break
            else:
                result = False
                break
        elif ps in rs_left:
            tmp_array.append(ps)
    
    if not result or len(tmp_array) > 0:
        print("no")
    else:
        print("yes")
