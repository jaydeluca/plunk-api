package com.roughnecks.plunkgame.repository

import com.roughnecks.plunkgame.model.Team
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository : JpaRepository<Team, Long> {
}