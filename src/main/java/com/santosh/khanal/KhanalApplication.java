package com.santosh.khanal;

import com.santosh.khanal.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KhanalApplication {

	public static void main(String[] args) {
		SpringApplication.run(KhanalApplication.class, args);

//		if public modifier used
//		Book book2 = new Book();
//		book2.id = 2;
//		book2.title = "titleA";
//		System.out.println(book2.id);

		// using private modifier
//		Book book2 = new Book();
//		book2.setId(3);
//		book2.setTitle("titleA");
//		System.out.println(book2.get_id());
	}

}
