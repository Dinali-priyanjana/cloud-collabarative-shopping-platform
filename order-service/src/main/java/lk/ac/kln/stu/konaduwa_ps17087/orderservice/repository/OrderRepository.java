package lk.ac.kln.stu.konaduwa_ps17087.orderservice.repository;

import lk.ac.kln.stu.konaduwa_ps17087.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
