import cv2

file_name = input('file_name : ')

cap = cv2.VideoCapture(file_name + '.mp4')

f = open(file_name + '.txt', 'w')

ret, current_frame = cap.read()
previous_frame = current_frame

pre_sec = 0
lastest_sec = 0
sec = 0

while cap.isOpened():
    print('Processing', file_name,
          "%.1g" % (cap.get(cv2.CAP_PROP_POS_FRAMES) / float(cap.get(cv2.CAP_PROP_FRAME_COUNT)) * 100) + '%', end='\r')
    current_frame_gray = cv2.cvtColor(current_frame, cv2.COLOR_BGR2GRAY)
    previous_frame_gray = cv2.cvtColor(previous_frame, cv2.COLOR_BGR2GRAY)



    frame_diff = cv2.absdiff(current_frame_gray, previous_frame_gray)

    cv2.imshow('frame_diff', frame_diff)

    frame_diff_sum = sum(sum(frame_diff))
    if frame_diff_sum > 200000:
        sec = cap.get(cv2.CAP_PROP_POS_FRAMES) // 30
        if pre_sec == 0:
            pre_sec = sec
            lastest_sec = pre_sec
        if sec - lastest_sec > 10:
            f.write("%02d:%02d ~ %02d:%02d" % (pre_sec // 60, pre_sec % 60, sec // 60, sec % 60))
        else:
            lastest_sec = sec

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

    previous_frame = current_frame.copy()
    ret, current_frame = cap.read()

    if (cap.get(cv2.CAP_PROP_POS_FRAMES) == cap.get(cv2.CAP_PROP_FRAME_COUNT)):
        break

f.write("%02d:%02d ~ %02d:%02d" % (pre_sec // 60, pre_sec % 60, sec // 60, sec % 60))
print('Done')
cap.release()
cv2.destroyAllWindows()
f.close()
