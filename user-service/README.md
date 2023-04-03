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

## User Service - Load Balancer

application.yml 에 server.port=0 으로 지정하면 random port 로 설정될 수 있다. 

mvn 으로 서버를 띄울 때도, 랜덤포트이므로 따로 포트지정 없이 실행할 수 있다.

```shell
mvn spring-boot:run
```

그런데 실행해서 보면 eureka 에 등록된 인스턴스는 1개로 밖에 보이지 않는다.

이유는, application.yml 에 등록된 application.name, server.port 를 지정하기 때문.

동적으로 할당된 port 가 아니라 yml 에 지정된 동일한 application.name, port 이므로 하나만 등록된 것.

이 해결을 위해서는 application.yml 에 아래 설정을 해주어야 한다. 

```yaml
eureka:
  instance:
    instance-id: ${spring.cloud.client.hostname}:${spring.application.instance_id:${random.value}}
```