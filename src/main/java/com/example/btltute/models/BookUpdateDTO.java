package com.example.btltute.models;

import com.example.btltute.domains.Book;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookUpdateDTO {

  private String title;

  private String author;

  private String description;

  private LocalDate releaseDate;

  private Integer pageNumber;

  private String category;

  private String imgLink;
}
