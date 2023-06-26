package lk.ac.kln.stu.konaduwa_ps17087.inventoryservice.controller;

import lk.ac.kln.stu.konaduwa_ps17087.inventoryservice.dto.InventoryResponse;
import lk.ac.kln.stu.konaduwa_ps17087.inventoryservice.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}
