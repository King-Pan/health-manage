package com.javalearn.healthmanage;

import com.javalearn.health.manage.HealthManageApplication;
import com.javalearn.health.manage.entity.Department;
import com.javalearn.health.manage.entity.Manager;
import com.javalearn.health.manage.entity.dto.AgedDTO;
import com.javalearn.health.manage.repository.DepartmentRepository;
import com.javalearn.health.manage.repository.ManagerRepository;
import com.javalearn.health.manage.service.AgedService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @AutoConfigureMockMvc 注入MockMvc
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HealthManageApplication.class)
@AutoConfigureMockMvc
public class HealthManageApplicationTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void contextLoads()throws Exception {
        String url = "/basic/test";
        /* 构建request 发送请求GET请求
         * MockMvcRequestBuilders 中有很多 请求方式。像get、post、put、delete等等
         */
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON)) // 断言返回结果是json
                .andReturn();// 得到返回结果

        MockHttpServletResponse response = mvcResult.getResponse();
        //拿到请求返回码
        int status = response.getStatus();
        //拿到结果
        String contentAsString = response.getContentAsString();
        System.err.println(status);
        System.err.println(contentAsString);
    }

    @Test
    public void pageList()throws Exception {
        String url = "/basic/";
        /* 构建request 发送请求GET请求
         * MockMvcRequestBuilders 中有很多 请求方式。像get、post、put、delete等等
         */
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(url)
                .accept(MediaType.APPLICATION_JSON)) // 断言返回结果是json
                .andReturn();// 得到返回结果

        MockHttpServletResponse response = mvcResult.getResponse();
        //拿到请求返回码
        int status = response.getStatus();
        //拿到结果
        String contentAsString = response.getContentAsString();
        System.err.println(status);
        System.err.println(contentAsString);
    }

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Test
    public void dept(){

        System.out.println();
        Department department = departmentRepository.getOne(1);
        System.out.println(department);
    }

    @Test
    public void manager(){
        Manager manager = managerRepository.getOne(1);
        System.out.println(manager);
    }


    @Autowired
    private AgedService agedService;

    @Test
    public void testPage(){
        System.out.println(agedService.getPageList(new AgedDTO(),new PageRequest(0,10)));
    }

}
