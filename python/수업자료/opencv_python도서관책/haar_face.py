import numpy as np
import cv2

# 얼굴 검출을 위한 케스케이드 분류기 생성 --- ①
face_cascade = cv2.CascadeClassifier('haarcascade_frontalface_default.xml')
# 눈 검출을 위한 케스케이드 분류기 생성 ---②
eye_cascade = cv2.CascadeClassifier('haarcascade_eye.xml')


cap = cv2.VideoCapture('new.mp4')
i = 0

while(cap.isOpened()):
    ret, frame = cap.read()
    
    i = i + 1
    if (i == 3):
        i = 0
        # 검출할 이미지 읽고 그레이 스케일로 변환 ---③
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        # 얼굴 검출 ---④
        faces = face_cascade.detectMultiScale(gray)
        # 검출된 얼굴 순회 ---⑤
        for (x,y,w,h) in faces:
            # 검출된 얼굴에 사각형 표시 ---⑥
            cv2.rectangle(frame,(x,y),(x+w,y+h),(255,0,0),2)
            # 얼굴 영역을 ROI로 설정 ---⑦
            roi = gray[y:y+h, x:x+w]
            # ROI에서 눈 검출 ---⑧
            eyes = eye_cascade.detectMultiScale(roi)
            # 검출된 눈에 사각형 표 ---⑨
            for (ex,ey,ew,eh) in eyes:
                cv2.rectangle(frame[y:y+h, x:x+w],(ex,ey),(ex+ew,ey+eh),(0,255,0),2)
        # 결과 출력 
        cv2.imshow('img',frame)
        if cv2.waitKey(27) > 0:
            break

cap.release()
cv2.destroyAllWindows()