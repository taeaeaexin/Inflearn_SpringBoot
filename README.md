# 모르는 내용 메모
- @ResponseBody
    - HTTP Body에 문자 내용을 직접 반환.
    - return 값이 객체인 경우 viewResolver 대신 HttpMessageConverter 동작
    - 문자 처리 : StringHttpMessageConverter
    - 객체 처리 : MappingJackson2HttpMessageConverter
    - Jackson : 객체를 json으로 바꿔주는 Library (google의 Gson도 있음 Spring은 Jackson 탑재)
- Map
- Lambda
- JUnit
- TemplateEngine : Thymeleaf

- JDBC (Java Database Connectivity) : ORM 아님

Java에서 DB와 연결할 수 있게 해주는 가장 낮은 수준의 API

Connection, Statement, ResultSet 등을 직접 써야 함 → SQL을 직접 다뤄야 함

단점: 반복 코드 많고 유지보수 힘듦


- MyBatis : SQL Mapper 프레임워크 (ORM은 아님)

SQL을 직접 작성하지만, Java 객체와 결과 매핑을 자동으로 해줌 → "반(半)자동 ORM"

XML 또는 어노테이션으로 SQL 정의

✅ 장점:

복잡한 쿼리 쉽게 작성 가능

능 제어가 뛰어남

- JPA (Java Persistence API) : 표준 ORM 사양

Java 객체 ↔ 테이블 자동 매핑

SQL 없이 객체 중심으로 DB 다룰 수 있음

Hibernate, EclipseLink 등이 JPA 구현체

- JPQL (Java Persistence Query Language) : JPA에서 사용하는 객체 지향 쿼리 언어

SQL과 비슷하지만, 테이블 이름이 아닌 엔티티 이름 사용

쿼리를 객체 기준으로 작성함

- Spring Data JPA : Spring이 제공하는 JPA 추상화/자동화 라이브러리

Repository 인터페이스만 작성하면 CRUD 구현 자동으로 생성

JPA 위에서 작동하며 개발자의 생산성을 극대화함

✅ 예시:

java
복사
편집
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
🔍 정리: 서로의 관계

기술	ORM 여부	역할	특징 요약
JDBC	❌	Java ↔ DB 연결	가장 저수준, SQL 직접 작성
MyBatis	❌	SQL 매핑 도구 (SQL → 객체)	SQL 직접 작성, 매핑 자동
JPA	✅	ORM 표준 인터페이스	객체 중심, SQL 최소화
JPQL	✅	JPA 전용 쿼리 언어	SQL 대신 객체 기준 쿼리
Spring Data JPA	✅	JPA를 쉽게 쓰게 해주는 추상화	메서드 이름만으로 쿼리 가능
✅ 결론
🔸 이 중에서 MyBatis는 ORM이 아니고,
🔸 JPA, JPQL, Spring Data JPA는 ORM,
🔸 JDBC는 가장 저수준의 DB 연결 API예요.

