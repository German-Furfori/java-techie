package com.paygoal.techie;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileReader;

@SpringBootTest
@AutoConfigureMockMvc
public abstract class TechieApplicationTests {

	@Autowired
	protected MockMvc mockMvc;

	@SneakyThrows
	protected String getContentFromFile(String filePath) {
		File file = new ClassPathResource(filePath).getFile();
		return FileCopyUtils.copyToString(new FileReader(file));
	}

}
