package com.roughnecks.plunkgame.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "player_score")
data class PlayerScore(
        @Id
        @GeneratedValue
        val id: Long = 0,
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
    fun type() = if (value == 1L) "Point" else "Plunk"
}