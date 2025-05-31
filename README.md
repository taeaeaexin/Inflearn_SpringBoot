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