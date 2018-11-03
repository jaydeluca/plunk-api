package com.roughnecks.plunkgame.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "player")
data class Player(
        val name: String,
        val wins: Int = 0,
        val losses: Int = 0,

        @JsonIgnore
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name= "team_id")
        var team: Team?

) : AuditModel() {
        @Id @GeneratedValue
        val id: Long = 0

        fun isAvailable() = team == null
}