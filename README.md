# herokuSpringBoot

### Heroku 배포 방법

#### 1. heroku CLI 설치
```shell
#windows
https://cli-assets.heroku.com/heroku-x64.exe

#Mac
brew install heroku/brew/heroku
```

#### 2. login

```shell
heroku login  # 회원 가입 선행되어야함.
```

#### 3. App 제작 

```kotlin
//각자에 맞에 구성 및 제작
```

추가적으로 자바 실행 버젼을 명시해주지 않으면 1.8기준으로 돌아감
프로젝트 루트에 system.properties를 만들어 java runtime을 지정해줘야함
```properties
java.runtime.version=11
```

#### 4. 배포 준비
```shell
heroku create
```
프로젝트 루트에서 실행하면 heroku라는 git remote를 생성한다. 

#### 5. 수정 사항 배포 및 빌드
```shell
git add .
git commit -m "메세지"
git push heroku master
```

push를 하면 자동으로 빌드를 해서 배포를 한다.

#### 6. 배포 후

```shell
heroku open #배포 된 웹 열기

heroku ps #배포 서버 상태 확인

heroku logs        # 배포 서버 로그 출력
heroku logs --tail # 배포 서버 로그 추가시 마다 출력
```

#### 7. 그 외

heroku create는 remote 를 heroku로 잡기 때문에 

github등은 remote를 origin으로 쓰면 된다.
