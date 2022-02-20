# inflearn 스프링 클라우드 마이크로 서비스 - Dowon Lee 님 강의

### maven 명령어로 서버 띄우기

#### 첫번째 방법

intelliJ - Edit Configuration

Application 복사 후, VM options 아래 내용 설정
```shell
-Dserver.port=9002
```

#### 두번째 방법

pom.xml, src, target 폴더가 있는 위치에서 실행 (프로젝트 루트 폴더)

```shell
mvn spring-boot:run -Dspring-boot.run.jvmArguments='-Dserver.port=9003'
```

#### 세번째 방법

pom.xml, src, target 폴더가 있는 위치에서 실행 (프로젝트 루트 폴더)

```shell
# target 폴더 및 빌드된 파일 제거
mvn clean

# 컴파일 및 빌드 (Building jar 위치 확인)
mvn compile package

 # 실행
java -jar -Dserver.port=9004 ./target/user-servce-0.0.1-SNAPSHOT.jar
```