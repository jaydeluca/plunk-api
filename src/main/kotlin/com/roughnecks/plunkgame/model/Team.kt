package com.roughnecks.plunkgame.model

import javax.persistence.*

@Entity
@Table(name = "team")
data class Team(
        val name: String

) : AuditModel() {

        @Id @GeneratedValue
        val id: Int = 0

        @OneToMany(mappedBy = "team", cascade = [(CascadeType.ALL)], fetch = FetchType.LAZY)
        val players: List<Player> = emptyList()


}