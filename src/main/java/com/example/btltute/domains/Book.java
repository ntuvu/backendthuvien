package com.example.btltute.domains;

import com.example.btltute.models.BookCreateDTO;
import com.example.btltute.models.BookUpdateDTO;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "author")
  private String author;

  @Column(name = "description")
  private String description;

  @Column(name = "release_date")
  private LocalDate releaseDate;

  @Column(name = "page_number")
  private Integer pageNumber;

  @Column(name = "category")
  private String category;

  @Column(name = "img_link")
  private String imgLink;

  public Book(BookCreateDTO dto) {
    this.title = dto.getTitle();
    this.author = dto.getAuthor();
    this.description = dto.getDescription();
    this.releaseDate = dto.getReleaseDate();
    this.pageNumber = dto.getPageNumber();
    this.category = dto.getCategory();
    this.imgLink = dto.getImgLink();
  }

  public void replace(BookUpdateDTO dto) {
    this.title = dto.getTitle();
    this.author = dto.getAuthor();
    this.description = dto.getDescription();
    this.releaseDate = dto.getReleaseDate();
    this.pageNumber = dto.getPageNumber();
    this.category = dto.getCategory();
    this.imgLink = dto.getImgLink();
  }
}
