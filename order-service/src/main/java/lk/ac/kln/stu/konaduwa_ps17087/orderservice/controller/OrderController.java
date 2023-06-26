package lk.ac.kln.stu.konaduwa_ps17087.orderservice.controller;

import lk.ac.kln.stu.konaduwa_ps17087.orderservice.dto.OrderRequest;
import lk.ac.kln.stu.konaduwa_ps17087.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }
}
