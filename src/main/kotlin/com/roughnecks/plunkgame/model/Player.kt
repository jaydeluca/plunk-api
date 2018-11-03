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
        val team: Team ?= null

) : AuditModel() {
        @Id @GeneratedValue
        val id: Long = 0

}