package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO GTB-完成度: * 功能缺陷较多，且影响比较严重。

//TODO GTB-完成度: - 默认的 user 查询时返回的 id 字段为 null。
//TODO GTB-完成度: - user id 不存在时应该返回 404，目前是 200。
//TODO GTB-完成度: - 创建 user 时没有校验 age。
//TODO GTB-完成度: - name 字段不存在时依然可以创建 user。
//TODO GTB-完成度: - 新创建的 user，在查询 educations 时，返回 1，应该是空数组。
//TODO GTB-完成度: - 给 新创建的 user 增加 educations 时，貌似都加到默认的 user 上去了。
//TODO GTB-完成度: - 创建 educations 时，description 字段不存在，但仍然创建成功了。

//TODO GTB-测试: * 没有实现任何自动化测试。

//TODO GTB-知识点: * Spring MVC 相关的知识点应用的不好。
//TODO GTB-知识点: * Optional API 掌握的不好。

//TODO GTB-工程实践: * clean code 欠缺明显。

//TODO GTB-工程实践: - 没有 .gitignore 文件，构建后产生很多无谓的变更。

//TODO GTB-综合: * 从功能实现到知识点再到工程实践，这次的表现都不太好，需要多加注意。

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
