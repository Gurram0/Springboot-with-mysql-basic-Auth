package com.SpringBootWithMySql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootWithMySql.Entitys.Roles;

public interface RolesRepository extends JpaRepository<Roles,Long> {

}
