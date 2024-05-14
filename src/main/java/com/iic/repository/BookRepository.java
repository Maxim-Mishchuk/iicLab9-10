package com.iic.repository;

import com.iic.core.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class BookRepository implements IBookRepository {
    List<Book> books = new ArrayList<>();
    {
        books.addAll(List.of(
                Book.builder().id(UUID.randomUUID()).author("Тарас Шевченко").title("Кобзар").build(),
                Book.builder().id(UUID.randomUUID()).author("Австрійский художник").title("Моя боротьба").build(),
                Book.builder().id(UUID.randomUUID()).author("Біллі Геррінґтон").title("Філософія Ґачімучі").build(),
                Book.builder().id(UUID.randomUUID()).author("ІА-14").title("Ми існуємо...").build()
        ));
    }

    @Override
    public List<Book> getAll() {
        return books;
    }
}
