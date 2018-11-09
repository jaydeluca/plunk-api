package com.roughnecks.plunkgame.model

import javax.persistence.*

@Entity
@Table(name = "game")
data class Game(
        @Id
        @GeneratedValue
        val id: Long = 0,

        @OneToMany(mappedBy = "game", cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
        val playerScores: List<PlayerScore> = emptyList()

) : AuditModel() {

}