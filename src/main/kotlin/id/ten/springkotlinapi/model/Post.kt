package id.ten.springkotlinapi.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Post (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @get: NotBlank
    val title: String = "",

    @get: NotBlank
    val content: String = ""
)