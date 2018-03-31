package com.api.searchinventory.controller;

import com.api.searchinventory.dto.Event;
import com.api.searchinventory.service.SearchInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchInventoryController {

    private SearchInventoryService searchInventoryService;


}
