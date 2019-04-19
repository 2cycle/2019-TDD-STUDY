
## 2주차 진행 사항

### 1. sonarcube, sonarlint
팀에서 sonarcube 와 sonarlint를 적용하고 있지만 유명무실한 존재로 남아있다.
이번 참에 직접 설치부터 custom config도 지급하면서 checkstyle 등도 적용해보자.


### 2. 객체지향체조 chapter 1.
넥스트 스텝에서 과제를 하면서 지키던 코딩 규약이 있었는데 성현님 덕분에 객체지향 생활체조 였다는 것을 알게 되었다.
개인 프로젝트에서만 조금씩 진행해볼 수 있지만 객체지향적인 방향의 개발을 다시 고민해보고 적용해보아야 겠다.
예제 코드는 블로그에도 업로드하여 꾸준히 볼 수 있도록 하자.

```text
- Use only one level of indentation per method.
  한 메서드에 오직 한 단계의 들여쓰기만 한다. (1 indent)
- Don’t use the else keyword.
  else 예약어 금지
- Wrap all primitives and strings.
  원시갑과 문자열의 포장
- Use only one dot per line.
  한 줄에 한 점만 사용
- Don’t abbreviate.
  축약 금지
- Keep all entities small.
- Don’t use any classes with more than two instance variables.
- Use first-class collections.
- Don’t use any getters/setters/properties.
```

### 3. 우리가 TDD에 실패하는 이유

중요 키워드였던 것은 우리가 보호해야 할 것은 ~~도메인~~ 이라는 것이었다. 또한 서비스 레이어는 줄이고 (pass throught)
비즈니스 로직을 도메인에 집중시켜 개발하는 방법이 TDD 를 실패하지 않는 방향성이라는 것에 조금 공감할 수 있었다. 

> 슬라이드 : https://www.slideshare.net/OKJSP/okkycon-tdd-120498731

> 영상 : https://www.youtube.com/watch?v=UttzAcbuk5k


### 차주 나의 준비
- 책 2장 읽어오기
- spring rest doc발표 (가능하면 swagger와 비교)