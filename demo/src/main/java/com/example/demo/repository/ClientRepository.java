package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.api.v1.objects.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}