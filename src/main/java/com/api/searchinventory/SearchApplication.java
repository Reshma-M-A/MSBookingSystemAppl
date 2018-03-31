package com.api.searchinventory;

import com.api.searchinventory.dto.Event;
import com.api.searchinventory.dto.Inventory;
import com.api.searchinventory.dto.Price;
import com.api.searchinventory.repository.SearchInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SearchApplication{


	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class, args);
	}


}
