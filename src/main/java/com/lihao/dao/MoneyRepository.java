package com.lihao.dao;

import com.lihao.pojo.MoneyPO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MoneyRepository extends JpaRepository<MoneyPO, Integer> {
}
