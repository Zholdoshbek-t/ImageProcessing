package com.inai.image;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "image")
public class ImageEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_seq"
    )
    @SequenceGenerator(
            name = "image_seq",
            sequenceName = "image_seq",
            allocationSize = 1
    )
    private Long id;

    private String url;

}
