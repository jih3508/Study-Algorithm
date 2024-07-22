# File 객체
class File():
    # 초기화
    def __init__(self, file):
        self.name = file
        i, j = 0, 0
        self.length = len(file)
        self.HEAD = None
        self.NUMBER = None
        # HEAD, NUMBER 구분 작업
        while (i < self.length):
            # HEAD부분 저장
            if self.HEAD == None and file[i].isdigit():
                self.HEAD = file[:i].lower()
                j = i
            # NUMBER 위치 체크 끝까지 숫자 있을수 있으므로 루프 빠지고 숫자 저장함
            if self.HEAD != None and (not file[i].isdigit()):
                break
            i += 1
        self.NUMBER = int(file[j:i])

def solution(files):
    Files = list(map(File, files))
    Files.sort(key=lambda file: (file.HEAD, file.NUMBER))
    return [file.name for file in Files]

print(solution(["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]))