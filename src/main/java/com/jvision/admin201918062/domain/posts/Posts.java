package com.jvision.admin201918062.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @Column(nullable = false)
    private String id;

    @Column(length=500, nullable = false)
    private String name;

    @Column(columnDefinition="TEXT", nullable = false)
    private String tel;

    private String address;
    @Column(columnDefinition = "TEXT", length = 300)
    private String intro;
    @Builder
    public Posts(String id, String name, String tel, String address, String intro)
    {   this.id = id;
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.intro = intro;
    }

    public void update(String title, String content)
    {
        this.name = title;
        this.tel = content;
    }
public String getId(){
        return id;
}
}
