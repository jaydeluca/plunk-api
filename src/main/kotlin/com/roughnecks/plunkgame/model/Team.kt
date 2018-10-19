package com.roughnecks.plunkgame.model

import javax.persistence.*

@Entity
@Table(name = "teams")
data class Team(
        @Id @GeneratedValue
        val id: Int = 0,
        val name: String,


        @OneToOne(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name = "player_one_id")
        var playerOne: Player,


        @OneToOne(cascade = arrayOf(CascadeType.ALL))
        @JoinColumn(name = "player_two_id")
        var playerTwo: Player


) : AuditModel() {

}