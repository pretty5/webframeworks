package com.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration//表示测试的是controller
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mvc.xml"})
public class StudentControllerTest {
@Autowired
    WebApplicationContext wac;
   MockMvc mockMvc;
    @Before
    public void setUp() throws Exception {
        mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void getStudent() throws Exception {
        String json="{\"id\":1,\"name\":\"jack\",\"age\":18}";
       mockMvc.perform(get("/student/get.do")
               .param("id","1"))

        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(json))
        .andReturn();

    }

    @Test
    public void hello() throws Exception {
        mockMvc.perform(post("/student/hello.do"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(view().name("hello"))
                .andExpect(model().attribute("name","tom"))
                .andExpect(model().attribute("age","18"))
                .andReturn();
    }
}