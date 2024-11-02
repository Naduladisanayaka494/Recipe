package com.recipie.Recipie.Entity;


import jakarta.persistence.*;

@Entity
public class RecipeFavorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String recipeUri;
    private String title;
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeUri() {
        return recipeUri;
    }

    public void setRecipeUri(String recipeUri) {
        this.recipeUri = recipeUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
