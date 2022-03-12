package com.example.casestudy4_springboot.repository;

import com.example.casestudy4_springboot.model.Bill_detail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBill_detailRepository extends PagingAndSortingRepository<Bill_detail, Long> {
}
