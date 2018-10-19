package com.roughnecks.plunkgame.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "players")
data class Player(
        @Id @GeneratedValue
        val id: Int = 0,
        val name: String,
        val wins: Int = 0,
        val losses: Int = 0

) : AuditModel() {

}