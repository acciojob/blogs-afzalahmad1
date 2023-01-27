package com.driver.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String Username;
    private String password;
    private String firstName;
    private String lastName;


   // @JsonIgnore
    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<Blog> blogList;

}