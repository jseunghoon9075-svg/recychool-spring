package com.app.recychool.repository;

import com.app.recychool.domain.entity.School;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@SpringBootTest
@Transactional
@Commit
@Slf4j
class SchoolRepositoryTest {
    @Autowired
    private SchoolRepository schoolRepository;
    @Test
    public void findAlltest(){
        List<School> schools = schoolRepository.findAll();
        schools.forEach(s -> System.out.println(s.getSchoolName()));
    }

    @Test
    public void schoolRepositoryTestsave100() {
        School school92 = new School();
        school92.setSchoolCity("포천시");
        school92.setSchoolName("영평초");
        school92.setSchoolAddress("경기도 포천시 영중면 전영로1429번길5");
//        school92.setSchoolLand(49937);
//        school92.setSchoolArea(2663);
        school92.setSchoolPhone("031-539-0033");
        school92.setSchoolImagePath("C:\\school");
        school92.setSchoolImageName("포천시_영평초.png");
        schoolRepository.save(school92);

        School school58 = new School();
        school58.setSchoolCity("안성시");
        school58.setSchoolName("구.백성초");
        school58.setSchoolAddress("경기도 안성시 백성2길59");
//        school58.setSchoolLand(24820);
//        school58.setSchoolArea(8469);
        school58.setSchoolPhone("031-678-5271");
        school58.setSchoolImagePath("C:\\school");
        school58.setSchoolImageName("안성시_구.백성초.jpg");
        schoolRepository.save(school58);

        School school2 = new School();
        school2.setSchoolCity("성동구");
        school2.setSchoolName("덕수고등학교(행당분교)");
        school2.setSchoolAddress("서울특별시 성동구 왕십리로 199");
//        school2.setSchoolLand(35128);
//        school2.setSchoolArea(20777);
        school2.setSchoolPhone("02-2286-3704");
        school2.setSchoolImagePath("C:\\school");
        school2.setSchoolImageName("성동구_덕수고등학교(행당분교).jpg");
        schoolRepository.save(school2);


        //예성 --------------------------------------------------------------------------------------------------
        School school1 = new School();
        school1.setSchoolCity("광진구");
        school1.setSchoolName("서울화양초등학교");
        school1.setSchoolAddress("서울특별시 광진구 군자로 9");
//        school1.setSchoolLand(5583); //대지
//        school1.setSchoolArea(3787); //연면적
        school1.setSchoolPhone("02-2286-3704");
        school1.setSchoolImagePath("C:\\school");
        school1.setSchoolImageName("광진구_서울화양초등학교.jpg");
        schoolRepository.save(school1);



        School school3 = new School();
        school3.setSchoolCity("성동구");
        school3.setSchoolName("성수공업고등학교");
        school3.setSchoolAddress("서울특별시 성동구 뚝섬로 365");
//        school3.setSchoolLand(13800);
//        school3.setSchoolArea(17427);
        school3.setSchoolPhone("02-2286-3704");
        school3.setSchoolImagePath("C:\\school");
        school3.setSchoolImageName("성동구_성수공업고등학교.jpg");
        schoolRepository.save(school3);

        School school4 = new School();
        school4.setSchoolCity("금천구");
        school4.setSchoolName("서울흥일초등학교");
        school4.setSchoolAddress("서울특별시 영등포구 문래로 121");
//        school4.setSchoolLand(4866);
//        school4.setSchoolArea(4094);
        school4.setSchoolPhone("02-2165-2122");
        school4.setSchoolImagePath("C:\\school");
        school4.setSchoolImageName("금천구_서울흥일초등학교.jpg");
        schoolRepository.save(school4);

        School school5 = new School();
        school5.setSchoolCity("강서구");
        school5.setSchoolName("서울염강초등학교");
        school5.setSchoolAddress("서울특별시 강서구 허준로 221-22");
//        school5.setSchoolLand(11076);
//        school5.setSchoolArea(5162);
        school5.setSchoolPhone("02-2600-0922");
        school5.setSchoolImagePath("C:\\school");
        school5.setSchoolImageName("강서구_서울염강초등학교.jpg");
        schoolRepository.save(school5);



    }
}