/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csc340sp23.bookmanager.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kachifadefalou
 */
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
