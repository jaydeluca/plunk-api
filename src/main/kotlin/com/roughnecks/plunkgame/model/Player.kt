package com.roughnecks.plunkgame.model

import javax.persistence.*

@Entity
@Table(name = "players")
data class Player(
        @Id @GeneratedValue
        val id: Int = 0,
        val name: String
) : AuditModel() {

}