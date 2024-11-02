package com.recipie.Recipie.Repository;

import com.recipie.Recipie.Entity.RecipeFavorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecipeFavoriteRepository extends JpaRepository<RecipeFavorite, Long> {
    List<RecipeFavorite> findByUserId(Long userId);
}
