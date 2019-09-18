package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.model.Metric;

@Repository
public interface MetricRepository extends JpaRepository<Metric, Long>{	
	
}
