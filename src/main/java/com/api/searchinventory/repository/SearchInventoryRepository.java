package com.api.searchinventory.repository;

import com.api.searchinventory.dto.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchInventoryRepository extends JpaRepository<Inventory, Long> {

    Inventory findInventoryByNameDateVenue(String name, String venue, String date);

}
