package lk.ac.kln.stu.konaduwa_ps17087.productservice.repository;

import lk.ac.kln.stu.konaduwa_ps17087.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
