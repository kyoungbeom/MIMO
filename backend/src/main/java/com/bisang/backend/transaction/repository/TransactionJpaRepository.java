package com.bisang.backend.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bisang.backend.transaction.domain.Transaction;

public interface TransactionJpaRepository extends JpaRepository<Transaction, Long> {
}
