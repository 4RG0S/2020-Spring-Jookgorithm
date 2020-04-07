n, m = map(int, input().split())

price_info = list()
for i in range(m):
    price_info.append(list(map(int, input().split())))

min_pack_price = sorted(price_info, key=lambda x : x[0])
min_one_price = sorted(price_info, key=lambda x : x[1])

final_min_pack = min_pack_price[0][0]
final_min_one = min_one_price[0][1]

if final_min_pack // 6 < final_min_one:
    if n < 6:
        if final_min_pack < final_min_one * n:
            print(final_min_pack)
        else:
            print(final_min_one * n)
    else:
        a, b = divmod(n, 6)
        if final_min_pack < final_min_one * b:
            print(final_min_pack * (a + 1))
        else:
            print(final_min_pack * a + final_min_one * b)
else:
    print(final_min_one * n)