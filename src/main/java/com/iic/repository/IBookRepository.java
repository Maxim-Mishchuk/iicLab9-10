package com.iic.repository;

import com.iic.core.Book;

import java.util.List;

public interface IBookRepository {
    List<Book> getAll();
}
