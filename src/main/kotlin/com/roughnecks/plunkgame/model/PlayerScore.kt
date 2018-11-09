package com.roughnecks.plunkgame.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "player_score")
data class PlayerScore(
        val value: Long = 0,

        @JsonIgnore
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name= "player_id")
        var player: Player?,

        @JsonIgnore
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name= "game_id")
        var game: Game?

) : AuditModel() {
    @Id
    @GeneratedValue
    val id: Long = 0

    fun type() = if (value == 1L) "Point" else "Plunk"
}