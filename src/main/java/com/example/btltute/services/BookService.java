package com.example.btltute.services;

import com.example.btltute.exceptions.CustomException;
import com.example.btltute.models.BookCreateDTO;
import com.example.btltute.models.BookResponseDTO;
import com.example.btltute.models.BookUpdateDTO;
import java.util.List;

public interface BookService {

  void create(BookCreateDTO dto) throws CustomException;

  BookResponseDTO get(Long id) throws CustomException;

  List<BookResponseDTO> getAll() throws CustomException;

  void update(BookUpdateDTO dto, Long id) throws CustomException;

  void delete(Long id) throws CustomException;
}
