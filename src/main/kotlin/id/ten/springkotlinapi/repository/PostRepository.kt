package id.ten.springkotlinapi.repository

import id.ten.springkotlinapi.model.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : JpaRepository<Post, Long> {
}