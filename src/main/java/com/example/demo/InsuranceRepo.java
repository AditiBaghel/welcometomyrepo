package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepo extends JpaRepository<Insurance,Integer>{
//	public void deleteByPolicyId(Long id);
//	public Optional<Insurance> findByPolicyID(Long id);
//	public Optional<Insurance> findByPolicyID(Long policyID);
}
