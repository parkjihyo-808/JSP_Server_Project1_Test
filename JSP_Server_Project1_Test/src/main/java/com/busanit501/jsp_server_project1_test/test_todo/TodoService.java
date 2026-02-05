package com.busanit501.jsp_server_project1_test.test_todo;

import com.busanit501.jsp_server_project1._0205_todo.dao._0205_3_TodoDAO;
import com.busanit501.jsp_server_project1._0205_todo.domain._0205_4_TodoVO;
import com.busanit501.jsp_server_project1._0205_todo.dto._0205_2_TodoDTO;
import com.busanit501.jsp_server_project1._0205_todo.util._0205_8_MapperUtil;
import com.busanit501.jsp_server_project1_test.dao.TodoDAO;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Log4j2
public enum TodoService {
    INSTANCE;

    // 1. 클래스 가져오기
    private TodoDAO dao;

}
