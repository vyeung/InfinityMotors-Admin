package com.st.il.infinitymotors.adminapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.st.il.infinitymotors.adminapp.model.CreditCard;

@Repository
public interface CreditCardDao extends JpaRepository<CreditCard, Integer>{
	
}
