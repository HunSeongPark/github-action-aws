package com.example.action;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : Hunseong-Park
 * @date : 2023-01-11
 */
@Entity
public class Post {
    @Id @GeneratedValue
    private Long postId;
    private String content;
}
