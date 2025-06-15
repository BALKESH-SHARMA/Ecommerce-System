package com.example.crud.repository;

import com.example.crud.entity.Orderitem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<Orderitem, Long> {
}
